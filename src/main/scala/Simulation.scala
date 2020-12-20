package ToucanSIM

import ToucanSIM.Rocket._
import scala.collection.mutable.ArrayBuffer

/**
 * Simulate rocket launch
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
      while (rocket.height >= 0) {
      	time += rocket.time
        mass += rocket.currentMass().asInstanceOf[Double]
        acceleration += rocket.acceleration().asInstanceOf[Double]

        println(time.mkString(" "))
        println(mass.mkString(" "))
        println(acceleration.mkString(" "))
      }
    }

    rocket.report()
  }
}
