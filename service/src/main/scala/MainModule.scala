import com.typesafe.config.{Config, ConfigFactory}
import routing.{PortBinding, Routing}
import scaldi.Module

class MainModule extends Module{
lazy val config: Config = ConfigFactory.load()

  bind[Config] to config
  bind[Routing] to new Routing
  bind[PortBinding] to new PortBinding
}
