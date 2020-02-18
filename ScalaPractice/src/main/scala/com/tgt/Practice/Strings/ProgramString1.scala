package com.tgt.Practice.Strings

object ProgramString1 {
  
  val greeting = "Hello, world!"
  var palindrome = " Dot saw I was Tod";
  val Sachin = " Sachin Chavan"
  val length = palindrome.length()
   def main(args: Array[String]) 
  {
      println( greeting )
      println("Length of the String : " + length)
      println("Concetenated String is : " + greeting.concat(palindrome))
      println("Concetenated String is : " + greeting.+(Sachin))
      
      
  }
}
