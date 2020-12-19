package ToucanSIM

/** Create rocket profile
 *
 *  @constructor Creates rocket profile.
 *  @param mass Mass of rocket. (grams)
 *  @param fuelMass Mass of rocket fuel. (grams)
 *  @param consumptionRate Rate of fuel consumption. (grams/second)
 *  @param thrust Thrust of Rocket. (newtons)
 */
object Rocket {
  class Rocket(val mass: Double, val fuelMass: Double, val consumptionRate: Double, val thrust: Double) {
  	var timeIncrement: Double = 0.01
  	var time: Double = 0.0
  	var height: Double = 0.0
    var totalMass: Double = mass + fuelMass
  	val gravity: Double = -9.8

    /** Unit conversion
     *
     *  @constructor Converts grams to other units.
     *  @param unit Unit to convert to. (kg or N)
     */
    def convert(kMass: Double, unit: String) = {
      if (unit == "kg") kMass / 1000
      else if (unit == "N") (kMass / 1000) * 9.8
      else "Fatal Error: conversion failed"
    }

    /** Calculate acceleration
     *
     *  @constructor Calculates acceleration.
     */
    def acceleration() = {
      val massNewtons: Double = convert(mass, "N").asInstanceOf[Double]
      if (totalMass >= mass) (thrust - massNewtons) / convert(totalMass, "kg").asInstanceOf[Double]
      else -9.8
    }

    /** Calculate current mass
     *
     *  @constructor Calculates current mass.
     */
    def currentMass() = {
      if (totalMass >= mass) mass + (fuelMass - (consumptionRate * time))
    }

    /** Update time
     *
     *  @constructor Increments time.
     */
    def updateTime() = {
      time += timeIncrement
    }

    def report() {
      println(f"Rocket Mass: $mass g")
      println(f"Fuel Mass: $fuelMass g")
      println(f"Consumption Rate: $consumptionRate g/s")
      println(f"Thrust: $thrust N")
    }
  }
}