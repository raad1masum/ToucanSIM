package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
  val rocket = new Rocket(98286580, 450767420, 1451496, 7607000)

  val sim = new Simulation(rocket)
}