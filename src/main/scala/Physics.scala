package ToucanSIM

import ToucanSIM.Simulation._
import org.jfree.chart._
import org.jfree.chart.ChartUtilities._
import org.jfree.data.category._
import org.jfree.data.xy._
import java.io._

/**
 * Plot data
 *
 *  @constructor Plots data.
 *  @param simulation Simulation.
 */
object Physics {
  class Physics(val simulation: Simulation) {
    /**
     * Plot position data
     *
     *  @constructor Plots position data.
     */
    def plotPosition {
      // create dataset
      val dataset = new DefaultXYDataset()
      dataset.addSeries("Series 1", Array(simulation.height.toArray, simulation.time.toArray))

      // create chart
      val chart: JFreeChart = ChartFactory.createXYLineChart("Position vs Time", "Position (meters)", "Time (seconds)", dataset, org.jfree.chart.plot.PlotOrientation.HORIZONTAL, false, false, false);

      // export to png
      val out: OutputStream = new FileOutputStream("plots/position_time.png");
      ChartUtilities.writeChartAsPNG(out, chart, 450, 400);
    }

    /**
     * Plot velocity data
     *
     *  @constructor Plots velocity data.
     */
    def plotVelocity {
      // create dataset
      val dataset = new DefaultXYDataset()
      dataset.addSeries("Series 1", Array(simulation.velocity.toArray, simulation.time.toArray))

      // create chart
      val chart: JFreeChart = ChartFactory.createXYLineChart("Velocity vs Time", "Velocity (meters/second)", "Time (seconds)", dataset, org.jfree.chart.plot.PlotOrientation.HORIZONTAL, false, false, false);

      // export to png
      val out: OutputStream = new FileOutputStream("plots/velocity_time.png");
      ChartUtilities.writeChartAsPNG(out, chart, 450, 400);
    }

    /**
     * Plot acceleration data
     *
     *  @constructor Plots accleration data.
     */
    def plotAcceleration {
      // create dataset
      val dataset = new DefaultXYDataset()
      dataset.addSeries("Series 1", Array(simulation.acceleration.toArray, simulation.time.toArray))

      // create chart
      val chart: JFreeChart = ChartFactory.createXYLineChart("Acceleration vs Time", "Acceleration (meters/second^2)", "Time (seconds)", dataset, org.jfree.chart.plot.PlotOrientation.HORIZONTAL, false, false, false);

      // export to png
      val out: OutputStream = new FileOutputStream("plots/acceleration_time.png");
      ChartUtilities.writeChartAsPNG(out, chart, 450, 400);
    }

    /**
     * Plot data
     *
     *  @constructor Plots all data.
     */
    def plot {
      plotPosition
      plotVelocity
      plotAcceleration
    }
  }
}
