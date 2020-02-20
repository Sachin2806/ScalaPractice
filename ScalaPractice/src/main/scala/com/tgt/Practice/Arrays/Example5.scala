package com.tgt.Practice.Arrays
import scala.Array._

object Example5 {
  
  def main(args: Array[String]){
    
   // Declaring arrays with range
   var myList1 = range(10, 20, 2)
   var myList2 = range(10, 20)
   
   for (i <- myList1)
   {
     println(" Value of i : " + i)
   }
   
   println()
   for (j <- myList2)
   {
     println(" Value of j : " + j)
   }
   
  }
}