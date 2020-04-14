package com.tgt.Practice.Collections

object ProgramList4 {
  
  def main(args: Array[String]){
    
      //You can use List.fill() method creates a list consisting of zero or more copies of the same element. 
      //Try the following example program.
       
      val fruit = List.fill(5)("Apples")
      val num = List.fill(10)(2)
      val fruit1 = List("apples", "oranges", "pears")
      
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
  }
}
