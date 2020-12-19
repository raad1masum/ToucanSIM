package ToucanSIM

object Rocket {
  class Rocket(val mass: Double, val fuelMass: Double, val consumptionRate: Double, val thrust: Double) {
  	var increment: Double = 0.01
  	var time: Double = 0.0
  	var height: Double = 0.0
  	val gravity: Double = -9.8

    def report() {
      println("Mass: " + mass)
      println("Thrust: " + thrust)
    }
  }
}