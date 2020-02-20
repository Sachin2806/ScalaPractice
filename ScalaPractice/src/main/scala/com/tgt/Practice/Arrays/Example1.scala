package com.tgt.Practice.Arrays

object Example1 {
  
  def main(args: Array[String]){
    
   //Declaring of an array
   var myList = Array(1.9, 2.9, 3.4, 3.5)
   
   //Print all elements from the array
   println("Length of the Array : " + myList.length)
   for(i <- myList)
   {
     println(i)
   }
   // Summing all elements
   var total = 0.0;
   for(i <- 0 to (myList.length - 1))
   {
     total = total + myList(i)
   }
   println("Total value is = " + total)
   
   // Finding the largest element  
   var max = myList(0)
   
   for (i <- 0 to (myList.length - 1))
   {
     if ( myList(i) > max ) max = myList(i) 
   }
   println("Max value is = " + max)
  }
}