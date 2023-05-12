package agh.wggios.analizadanych

import org.apache.log4j.{Level,Logger}

object LoggingUtils {
  def setupLogging(): Unit = {
   Logger.getLogger("org").setLevel(Level.WARN)
   Logger.getLogger("org.apache.spark").setLevel(Level.INFO)
   Logger.getLogger("org.apache.hadoop.util.NativeCodeLoader").setLevel(Level.ERROR)
   Logger.getLogger("agh.wggios.analizadanych").setLevel(Level.DEBUG)
   Logger.getLogger("com.databricks").setLevel(Level.ERROR)
   Logger.getLogger("com.databricks.SparkServiceRPCClient").setLevel(Level.WARN)
   Logger.getLogger("com.databricks.Log4jUsageLogger").setLevel(Level.WARN)
   Logger.getLogger("privateLog").setLevel(Level.WARN)
   Logger.getLogger("akka").setLevel(Level.WARN)
  }


}
