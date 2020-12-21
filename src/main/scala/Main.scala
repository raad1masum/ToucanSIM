package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
	// SpaceX Falcon 9
  val Falcon9 = new Rocket(22200000, 433100000, 1090931.99, 7607000)

	// NASA Saturn V
  val SaturnV = new Rocket(130000000, 615962205.49, 18143695, 33361662.211881433)

  val sim = new Simulation(Falcon9)
  sim.run

  val phys = new Physics(sim)
  phys.plotAll
}