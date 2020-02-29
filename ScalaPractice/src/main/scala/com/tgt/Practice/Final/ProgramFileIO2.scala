package com.tgt.Practice.Final



import scala.io.Source

object ProgramFileIO2 {
  
  def main(args: Array[String])
  {
    //Source.fromFile("C:/Users/CSC/git/ScalaPractice/ScalaPractice/Files/Input/Spark.txt").foreach(print)
    val fileSource = Source.fromFile("C:/Users/CSC/git/ScalaPractice/ScalaPractice/Files/Input/Spark.txt")
    val fileContents = Source.fromFile("C:/Users/CSC/git/ScalaPractice/ScalaPractice/Files/Input/Spark.txt").getLines().mkString(",")
    
//    while(fileSource.hasNext)
//    {
//      print(fileSource.next())
//    }
//    fileSource.close()
    println("Value from fileContents :" + fileContents) 
  }
}