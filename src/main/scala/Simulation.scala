package ToucanSIM

import ToucanSIM.Rocket._
import scala.collection.mutable.ArrayBuffer

/** Simulate rocket launch
 *
 *  @constructor Simulates rocket launch.
 *  @param rocket Rocket profile.
 */
object Simulation {
	class Simulation(val rocket: Rocket) {
		var mass = ArrayBuffer[Double]()
		var time = ArrayBuffer[Double]()
		var height = ArrayBuffer[Double]()
		var velocity = ArrayBuffer[Double]()
		var acceleration = ArrayBuffer[Double]()

		def run() {
			times += 1.0
			println(times.mkString(" "))	
		}

		rocket.report()
	}
}
