package ToucanSIM

import ToucanSIM.Simulation._
import org.jfree.chart._
import org.jfree.chart.ChartUtilities._
import org.jfree.data.category._
import org.jfree.data.xy._
import java.io._

object Physics {
  class Physics(val simulation: Simulation) {
    def plot {
    	val dataset = new DefaultXYDataset()
      dataset.addSeries("Series 1", Array(simulation.time.toArray, simulation.velocity.toArray))

      val chart: JFreeChart = ChartFactory.createXYLineChart("Velocity vs Time", "Velocity", "Time", dataset, org.jfree.chart.plot.PlotOrientation.HORIZONTAL, false,false,false);

      val out: OutputStream = new FileOutputStream("plots/velocityout.png");
      ChartUtilities.writeChartAsPNG(out, chart, 450, 400);
    }
  }
}
