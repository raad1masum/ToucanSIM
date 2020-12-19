package ToucanSIM

import ToucanSIM.Rocket._
import ToucanSIM.Physics._
import ToucanSIM.Simulation._

object Main extends App {
	// printf("Enter Mass of Rocket: ")
	// val mass: Double = scala.io.StdIn.readDouble()
	// printf("Enter Thrust of Rocket: ")
	// val thrust: Double = scala.io.StdIn.readDouble()
	// printf("Enter Thrust Time of Rocket: ")
	// val thrustTime: Double = scala.io.StdIn.readDouble()

  val rocket = new Rocket(98286580, 450767420, 1451496, 7607000)

  val sim = new Simulation(rocket)
}