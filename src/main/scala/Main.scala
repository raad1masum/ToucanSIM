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

  /**
   * Create custom rocket
   *
   *  @constructor Creates custom rocket.
   */
  def custom: Rocket = {
    println("ToucanSIM Rocket Configurator")

    // name
    print("Enter Rocket Name: ")
    val name: String = scala.io.StdIn.readLine()

    // mass
    print("Enter Rocket Mass (grams): ")
    val mass: Double = scala.io.StdIn.readLine().toDouble

    // fuel mass
    print("Enter Fuel Mass (grams): ")
    val fuelMass: Double = scala.io.StdIn.readLine().toDouble

    // consumption rate
    print("Enter Fuel Consumption Rate (grams/second): ")
    val consumptionRate: Double = scala.io.StdIn.readLine().toDouble

    // thrust
    print("Enter Engine Thrust (newtons): ")
    val thrust: Double = scala.io.StdIn.readLine().toDouble

    val customRocket = new Rocket(name, mass, fuelMass, consumptionRate, thrust)

    customRocket
  }

  /**
   * Run simulation
   *
   *  @constructor Runs simulation.
   *  @param rocket Rocket to run simulation on.
   */
  def run(rocket: Rocket) {
    val sim = new Simulation(rocket)
    val phys = new Physics(sim)

    sim.run
    phys.plot
  }

  // menu
  println("1. Falcon9")
  println("2. SaturnV")
  println("3. Custom")
  print("Select a rocket to simulate: ")

  val selectedRocket: Int = scala.io.StdIn.readLine().toInt

  val rocket = selectedRocket match {
    case 1 => Falcon9: Rocket
    case 2 => SaturnV: Rocket
    case 3 => custom
    case _ => custom
  }

  // driver
  rocket.report
  run(rocket)
}