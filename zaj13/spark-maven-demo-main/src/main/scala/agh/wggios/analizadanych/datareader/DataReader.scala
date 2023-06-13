package agh.wggios.analizadanych.datareader

import agh.wggios.analizadanych
import agh.wggios.analizadanych.SparkSessionProvider
import org.apache.spark.sql.DataFrame
import org.apache.log4j.Logger

class DataReader extends SparkSessionProvider {

  @transient lazy val logger: Logger = Logger.getLogger(getClass.getName)

  def readCsv(path: String): DataFrame = {
    if(path==""){
      logger.error("Path empty.")
      return null
    } else if(Character.isDigit(path[0])) {
      logger.warn("Path starts with a number.")
    }

    val df = spark.read.format("csv")
      .option("header","true")
      .load(path) //"cars.csv"

    logger.info("In DataReader method.")

    return df
  }
}
