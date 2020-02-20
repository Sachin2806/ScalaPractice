package com.tgt.Practice.Arrays
import scala.Array._

object Example6 {
  
  def main(args: Array[String]){
   
   //Program to find the total marks taken by Sachin, min and max marks
   var sachinMarks = Array(75,80,92,76,54)
   
   //Print all the marks
   
   println("Marks Scored are : ")
   for (i <- sachinMarks)
   {
     println(i)
   }
   
   println()
   var totalMarks = 0
   for (i <- 0 to (sachinMarks.length - 1))
   {
     totalMarks = totalMarks + sachinMarks(i)
   }
    println("Total marks Scored : " + totalMarks)
    
   var maxMarks = sachinMarks(0)
   var minMarks = sachinMarks(0)
   
   for (i <- 0 to (sachinMarks.length - 1))
   {
     if ( sachinMarks(i) > maxMarks ) maxMarks = sachinMarks(i)
    
   }
   println("Max marks Scored : " + maxMarks)
  
   for (i <- 0 to (sachinMarks.length - 1))
   {
     if ( sachinMarks(i) < minMarks ) minMarks = sachinMarks(i)
    
   }
   println("Min marks Scored : " + minMarks)
   
   var average = 0.0
   average = totalMarks / 5
   println("Average marks Scored : " + average)
   
  }
  
  
  
}