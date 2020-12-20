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
        acceleration += rocket.currentAcceleration().asInstanceOf[Double]

        if (velocity.size > 0) {
        	rocket.velocity	= velocity.last + (acceleration.last * rocket.timeIncrement)
        } else {
        	rocket.velocity = 0.0
        }

        velocity += rocket.velocity

        if (height.size > 0) {
        	rocket.height = height.last + (velocity.last * rocket.timeIncrement) + (0.5 * acceleration.last * scala.math.pow(rocket.timeIncrement, 2))
        } else {
        	rocket.height = 0.0
        }

        height += rocket.height
        rocket.updateTime()

        // println("Time: " + time.mkString(" "))
        // println("Mass: " + mass.mkString(" "))
        // println("Height: " + height.mkString(" "))
        // println("Velocity: " + velocity.mkString(" "))
        // println("Velocity: " + velocity.mkString(" "))
        // println("Acceleration: " + acceleration.mkString(" "))

        // println("Time: " + time.last)
        // println("Mass: " + mass.last)
        // println("Height: " + height.last)
        // println("Velocity: " + velocity.last)
        // println("Velocity: " + velocity.last)
        // println("Acceleration: " + acceleration.last)
      }
    }

    rocket.report()
  }
}
