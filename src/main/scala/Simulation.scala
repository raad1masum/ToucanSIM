package ToucanSIM

import ToucanSIM.Rocket._

/** Simulate rocket launch
 *
 *  @constructor Simulates rocket launch.
 *  @param rocket Rocket profile.
 */
object Simulation {
	class Simulation(val rocket: Rocket) {
		rocket.report()
	}
}
