package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
	println("ToucanSIM")

	// SpaceX Falcon 9
  val Falcon9 = new Rocket("SpaceX Falcon 9", 22200000, 433100000, 1090931.99, 7607000)

	// NASA Saturn V
  val SaturnV = new Rocket("NASA Saturn V", 130000000, 615962205.49, 18143695, 33361662.211881433)

  def run(rocket: Rocket) {
  	val sim = new Simulation(rocket)
  	val phys = new Physics(sim)

  	sim.run
  	phys.plot
  }

  println("1. Falcon9")
  println("2. SaturnV")
  println("3. Custom")
  print("Select a rocket to simulate: ")

  val selectedRocket: Int = scala.io.StdIn.readLine().toInt

  val rocket = selectedRocket match {
    case 1  => Falcon9: Rocket
    case 2  => SaturnV: Rocket
    case 3  => Falcon9: Rocket
    case _  => Falcon9: Rocket
  }

  val name: String = rocket.name
  println(f"Running ToucanSIM for $name")
  rocket.report

  run(rocket)
}