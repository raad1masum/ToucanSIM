import Rocket._
import Simulation._

object Main extends App {
  val rocket = new Rocket(1000, 160000, 60)
  rocket.report()
  
  val sim = new Simulation()
}