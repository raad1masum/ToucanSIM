package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
  val rocket = new Rocket(98286580, 450767420, 1451496, 7607000)
  val otherRocket = new Rocket(1000, 100, 60, 10)

  println(rocket.currentMass())
  println(otherRocket.currentMass())

  val sim = new Simulation(rocket)
}