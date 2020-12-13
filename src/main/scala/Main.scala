package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Simulation._

object Main extends App {
	printf("Enter Mass of Rocket: ")
	val mass: Double = scala.io.StdIn.readDouble()
	printf("Enter Thrust of Rocket: ")
	val thrust: Double = scala.io.StdIn.readDouble()
	printf("Enter Thrust Time of Rocket: ")
	val thrustTime: Double = scala.io.StdIn.readDouble()

  val rocket = new Rocket(mass, thrust, thrustTime)
  rocket.report()
  
  val sim = new Simulation()
}