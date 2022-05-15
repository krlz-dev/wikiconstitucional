package database

import scaldi.{Injectable, Injector}
import slick.dbio.{DBIOAction, Effect, NoStream}
import slick.jdbc.JdbcBackend

import scala.concurrent.Future

class DatabaseCommands(implicit var injector: Injector) extends Injectable {
  val db = inject[JdbcBackend#DatabaseDef]

  def runQuery[T](query: DBIOAction[T, NoStream, Effect.All]): Future[T] = {
    db.run(query)
  }
}
