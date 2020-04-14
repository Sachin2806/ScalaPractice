package com.tgt.Practice.Lists

object ProgramList3 {
  
  def main(args: Array[String]){
    
      //You can use List.fill() method creates a list consisting of zero or more copies of the same element. 
      //Try the following example program.
       
      val fruit = List.fill(5)("Apples")
      val num = List.fill(10)(2)
      val fruit1 = List("apples", "oranges", "pears")
      
      val a = List(10,20,30,40,50)
      //The zip operation takes two lists and forms a list of pairs
      val b = a.indices zip a
      
      //If the two lists are of different length, any unmatched elements are dropped
      val zipped = "abcde" zip List(1, 2, 3).toList
      val part = List(1,2,3,4,5,6)
      
      //Tabulating a function
      val xs1 = List.tabulate(5)(_ + 1)
      val xs2 = List.tabulate(5)(_ + 2)
      val xs3 = List.tabulate(3, 6) (_ * _)
      
      println( "fruit : " + fruit )
      println( "num : " + num )
      println( "xs1 : " + xs1 )
      println( "xs2 : " + xs2 )
      println( "xs3 : " + xs3 )
      println("Reversing List" + fruit1.reverse)
      
      println("Demo of indices 					: " + a.indices)
      println("Demo of zip with indices : " + b)
      println("Demo of zip with indices : " + zipped)
      println("Demo of partition : " + part.partition(_ %2 == 0))
      println("Demo of find		 : " + part.find(_ %2 == 0))
      println("Demo of find		 : " + part.find(_  <= 0))
      
  }
}
