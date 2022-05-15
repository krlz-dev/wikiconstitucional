package routing

import akka.actor.ActorSystem
import akka.http.scaladsl.model.{ContentTypes, HttpEntity, HttpResponse, StatusCodes}
import models.HttpResponseModel
import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization

import scala.concurrent.{ExecutionContext, Future}

class HttpResponseFactory {
  implicit val formats: DefaultFormats = org.json4s.DefaultFormats

  def createHttpResponse[T <: HttpResponseModel : Manifest](response: Future[Option[T]])(implicit executionContext: ExecutionContext, actorSystem: ActorSystem): Future[HttpResponse] = {
    response.map {
      case Some(response) => HttpResponse(status = StatusCodes.OK, entity = HttpEntity(ContentTypes.`application/json`, Serialization.write(response)))
      case None => HttpResponse(status = StatusCodes.OK, entity = HttpEntity(ContentTypes.`application/json`, "{}"))
    }
  }
}
