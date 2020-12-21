package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
	println(Console.BLUE + "ToucanSIM")

	// SpaceX Falcon 9
  val Falcon9 = new Rocket(22200000, 433100000, 1090931.99, 7607000)

	// NASA Saturn V
  val SaturnV = new Rocket(130000000, 615962205.49, 18143695, 33361662.211881433)

  def run(rocket: Rocket) {
  	val sim = new Simulation(rocket)
  	val phys = new Physics(sim)

  	sim.run
  	phys.plot
  }

  println("Select a rocket to test:")
  println("1. Falcon9")
  println("2. SaturnV")
  println("3. Custom")

  val selectedRocket: Int = scala.io.StdIn.readLine().toInt

  val rocket: Rocket = selectedRocket match {
    case 1  => Falcon9
    case 2  => SaturnV
    case 3  => Falcon9
    case _  => Falcon9
  }

  run(rocket)
}