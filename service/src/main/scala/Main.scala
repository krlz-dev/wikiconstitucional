import akka.actor.ActorSystem
import routing.{PortBinding, Routing}
import scaldi.{Injectable, Module}

import scala.concurrent.ExecutionContextExecutor

object Main extends App with Injectable {
  implicit val system: ActorSystem = ActorSystem("my-system")
  implicit val executionContext: ExecutionContextExecutor = system.dispatcher
  implicit val mainModule: Module = new MainModule

  val routing = inject[Routing]
  val portBinding = inject[PortBinding]

  portBinding.bindRoutesToPort(8081, routing.createRoute)
}
