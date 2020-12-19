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
  	var increment: Double = 0.01
  	var time: Double = 0.0
  	var height: Double = 0.0
  	val gravity: Double = -9.8

    def report() {
      println("Mass: " + mass)
      println("Thrust: " + thrust)
    }

    /** Unit conversion
     *
     *  @constructor Converts grams to other units.
     *  @param unit Unit to convert to. (kg or N)
     */
    def convert(unit: String) = {
      if (unit == "kg") mass / 1000
      else if (unit == "N") (mass / 1000) * 9.8
      else "Fatal Error: conversion failed"
    }
  }
}