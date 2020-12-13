object Rocket {
  class Rocket(val mass: Double, val thrust: Double, val thrustTime: Double) {
  	def report() {
  		println("Mass: " + mass)
  		println("Thrust: " + thrust)
  		println("Thrust Time: " + thrustTime)
  	}
  }
}