package routing

import akka.actor.ActorSystem
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import ch.megard.akka.http.cors.scaladsl.CorsDirectives.cors
import database.ArticlesRepository
import models.Article
import scaldi.{Injectable, Injector}

import scala.concurrent.{ExecutionContext, Future}

class Routing(implicit var injector: Injector) extends Injectable {
  val httpResponseFactory: HttpResponseFactory = inject[HttpResponseFactory]
  val articlesRepository: ArticlesRepository = inject[ArticlesRepository]

  def createRoute(implicit executionContext: ExecutionContext, actorSystem: ActorSystem): Route = {
    Route.seal(
      cors() {
        get {
          {
            concat(
              path("ping") {
                complete("pong")
              },
              pathPrefix("article") {
                path(Segment) {
                  articleId: String =>
                    val article: Future[Option[Article]] = articlesRepository.getArticleById(articleId)
                    val httpResponse: Future[HttpResponse] = httpResponseFactory.createHttpResponse[Article](article)

                    complete(httpResponse)
                }
              }
            )
          }
        }
      }
    )
  }
}
