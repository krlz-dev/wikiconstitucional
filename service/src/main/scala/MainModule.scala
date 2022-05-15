import com.typesafe.config.{Config, ConfigFactory}
import database.{ArticlesQuery, ArticlesRepository, DatabaseCommands}
import routing.{HttpResponseFactory, PortBinding, Routing}
import scaldi.Module
import slick.jdbc.{JdbcBackend, PostgresProfile}

class MainModule extends Module{
lazy val config: Config = ConfigFactory.load()

  bind[Config] to config
  bind[Routing] to new Routing
  bind[PortBinding] to new PortBinding
  bind[JdbcBackend#DatabaseDef] to PostgresProfile.backend.Database.forConfig("databaseConfig")
  bind[ArticlesQuery] to new ArticlesQuery
  bind[DatabaseCommands] to new DatabaseCommands
  bind[ArticlesRepository] to new ArticlesRepository
  bind[HttpResponseFactory] to new HttpResponseFactory
}
