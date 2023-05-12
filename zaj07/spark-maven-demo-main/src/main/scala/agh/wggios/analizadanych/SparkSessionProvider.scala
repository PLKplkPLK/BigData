package agh.wggios.analizadanych

import org.apache.spark.sql.SparkSession
import org.apache.spark.internal.Logging

trait SparkSessionProvider extends Logging {
  val spark = SparkSession.builder()
    .appName("jakas_nazwa")
    .config("spark.driver.memory","2000m")
    .master("local[4]")
    .getOrCreate()

  LoggingUtils.setupLogging()

  def getSparkSession(): SparkSession = {
    return  spark
  }

}