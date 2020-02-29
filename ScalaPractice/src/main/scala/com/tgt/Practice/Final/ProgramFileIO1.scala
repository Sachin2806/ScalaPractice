package com.tgt.Practice.Final

import java.io.File
import java.io.PrintWriter
import scala.io.Source

object ProgramFileIO1 {
  
  def main(args: Array[String]){
  
    val writer = new PrintWriter(new File("C:/Users/CSC/git/ScalaPractice/ScalaPractice/Files/Outfile/test.txt"))
    writer.write("Hello Scala: ")
    writer.close()
    
    print("Enter you input")
    val line = Console.readLine()
    println("Thanks, you just typed: " + line)
    
    println("Following is the content read:" )
    Source.fromFile("C:/Users/CSC/git/ScalaPractice/ScalaPractice/Files/Input/Spark.txt").foreach(print)
  }
}