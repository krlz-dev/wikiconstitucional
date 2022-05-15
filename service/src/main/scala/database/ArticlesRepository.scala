package database

import models.{Article, Section}
import scaldi.{Injectable, Injector}
import slick.jdbc.GetResult

import scala.concurrent.{ExecutionContext, Future}

class ArticlesRepository(implicit var injector: Injector) extends Injectable {
  private val database = inject[DatabaseCommands]
  private val articlesQuery = inject[ArticlesQuery]

  def getArticleById(articleId: String)(implicit executionContext: ExecutionContext): Future[Option[Article]] = {
    val getArticleQuery = articlesQuery.getArticleDataQuery(articleId)
    val getArticleAnalysisQuery = articlesQuery.getAnalysisDataQuery(articleId)

    for {
      sections <- database
        .runQuery(getArticleAnalysisQuery.as[Section](GetResult(
          result =>
            Section(
              title = result.nextString,
              `type` = result.nextString,
              content = result.nextString,
              concordances = result.nextString,
              lastUpdate = result.nextString)
        ))).map(_.toList)
      article <- database.runQuery(getArticleQuery.as[Article](GetResult(result =>
        Article(
          title = result.nextString,
          content = result.nextString,
          presentation = result.nextString,
          description = result.nextString,
          treatmentInConstitution = result.nextString,
          treatmentInActs = result.nextString,
          reachOfLegalReserve = result.nextString,
          bibliography = result.nextString,
          webgraphy = result.nextString,
          legalDocuments = result.nextString,
          resolutionDocuments = result.nextString,
          lastUpdate = result.nextString,
          sections = sections,
        )
      )).headOption)
    } yield {
      article
    }
  }
}
