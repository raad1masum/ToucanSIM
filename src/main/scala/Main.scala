object Main extends App {
  println("Hello, World!")

  class Rocket(var kMass: Double) {
  	val mass = kMass;
  }

  var rocket = new Rocket(1000)
  println(rocket.mass)
}