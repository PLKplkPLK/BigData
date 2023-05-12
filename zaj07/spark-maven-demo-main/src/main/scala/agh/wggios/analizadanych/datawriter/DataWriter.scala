package agh.wggios.analizadanych.datawriter

import agh.wggios.analizadanych.SparkSessionProvider
import org.apache.spark.sql.DataFrame

class DataWriter extends SparkSessionProvider {
  def writeCsv(df: DataFrame, path: String): Unit = {
    df.write.format("csv")
      .option("header", "true")
      .save(path)
  }
}
