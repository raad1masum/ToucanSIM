package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
	// SpaceX Falcon 9
  val rocket = new Rocket(22200000, 433100000, 1090931.99, 7607000)

  val sim = new Simulation(rocket)
  sim.run

  val phys = new Physics(sim)
  phys.plotAll
}