package agh.wggios.analizadanych.datatransformer

import agh.wggios.analizadanych.SparkSessionProvider
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col

class DataTransformer extends SparkSessionProvider {
  def doubleVal(df: DataFrame, cl: String): DataFrame = {
    return df.withColumn(cl, col(cl)*2)
  }
}
