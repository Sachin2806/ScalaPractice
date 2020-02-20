package com.tgt.Practice.Arrays
import scala.Array.concat

object Example2 {
  
  def main(args: Array[String]){
    
   //Scala program to concatenate two array by using concat() method 
   var myList1 = Array(1.9, 2.9, 3.4, 3.5)
   var myList2 = Array(8.9, 7.9, 0.4, 1.5)

   var myList3 =  concat(myList1, myList2)
   var myList4 =  myList1 ++ myList2
      
   // Print all the array elements
   for ( x <- myList3 ) 
   {
    println( x )
    }
   
   // Print all the array elements
  println("Other way of concetenating")
   for ( x <- myList4 ) 
   {
    
     println( x )
    }
  }
}