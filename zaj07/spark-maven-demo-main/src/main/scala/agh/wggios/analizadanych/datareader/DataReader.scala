package agh.wggios.analizadanych.datareader

import agh.wggios.analizadanych
import agh.wggios.analizadanych.SparkSessionProvider
import org.apache.spark.sql.DataFrame

class DataReader extends SparkSessionProvider {

  def readCsv(path: String): DataFrame = {
    val df = spark.read.format("csv")
      .option("header","true")
      .load(path) //"cars.csv"

    return df
  }
//
//   def readData(): DataFrame = { extends SparkSessionProvider
//     isDataReadable = isDataSchemaReadable()
//
//    if (isDataReadabŁe) returnReadData()
//   }
//
//  def isDataAvai1able(): Boolean
//
//  return false
//
//  def returnReadData()
//
//  Boolean
//  DataFrame
//  spark.read.format(source =
//  val df =
//    path =
//  '
//  return df
//
//  def isDataSchemaReadab1e():
//
//  return true
//  Boolean =Boolean

}
