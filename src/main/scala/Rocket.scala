package ToucanSIM

/**
 * Create rocket profile
 *
 *  @constructor Creates rocket profile.
 *  @param mass Mass of rocket. (grams)
 *  @param fuelMass Mass of rocket fuel. (grams)
 *  @param consumptionRate Rate of fuel consumption. (grams/second)
 *  @param thrust Thrust of Rocket. (newtons)
 */
object Rocket {
  class Rocket(val name: String, val mass: Double, val fuelMass: Double, val consumptionRate: Double, val thrust: Double) {
    var time: Double = 0.0
    var height: Double = 0.0
    var velocity: Double = 0.0
    var timeIncrement: Double = 0.01
    var acceleration: Double = 0.0
    var totalMass: Double = mass + fuelMass
    val gravity: Double = -9.8

    /**
     * Unit conversion
     *
     *  @constructor Converts grams to other units.
     *  @param unit Unit to convert to. (kg or N)
     */
    def convert(kMass: Double, unit: String) = {
      if (unit == "kg") kMass / 1000
      else if (unit == "N") (kMass / 1000) * 9.8
      else "Fatal Error: conversion failed"
    }

    /**
     * Calculate acceleration
     *
     *  @constructor Calculates acceleration.
     */
    def currentAcceleration = {
      val massNewtons: Double = convert(mass, "N").asInstanceOf[Double]
      if (totalMass >= mass) {
        acceleration = (thrust - massNewtons) / convert(totalMass, "kg").asInstanceOf[Double]
      } else acceleration = -9.8
      acceleration
    }

    /**
     * Calculate current mass
     *
     *  @constructor Calculates current mass.
     */
    def currentMass = {
      if (totalMass >= mass) totalMass = mass + (fuelMass - (consumptionRate * time))
      totalMass
    }

    /**
     * Update time
     *
     *  @constructor Increments time.
     */
    def updateTime = {
      time += timeIncrement
    }

    /**
     * Report profile
     *
     *  @constructor Reports rocket profile.
     */
    def report {
      println(f"Running ToucanSIM for $name")
      println(f"Rocket Mass: $mass g")
      println(f"Fuel Mass: $fuelMass g")
      println(f"Consumption Rate: $consumptionRate g/s")
      println(f"Thrust: $thrust N")
    }
  }
}