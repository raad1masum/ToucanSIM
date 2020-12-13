object Rocket {
  class Rocket(val mass: Double, val thrust: Double, val thrustTime: Double) {
  	def report() {
  		println(mass)
  		println(thrust)
  		println(thrustTime)
  	}
  }
}