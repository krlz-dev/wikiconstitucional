package routing

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route

import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success}

class PortBinding {
  def bindRoutesToPort(port: Int, route: Route)(implicit executionContext: ExecutionContext, actorSystem: ActorSystem): Unit = {
    Http()
      .newServerAt("0.0.0.0", port)
      .bind(route)
      .onComplete {
        case Success(value) => println(s"The service now online in  ${value.localAddress.getHostName}:${value.localAddress.getPort}")
        case Failure(ex) => println(s"The service has failed to start")
      }
  }
}
