package com.tgt.Practice.Strings

object ProgramString3 {
  
  //Example program, which makes use of printf() method −
   def main(args: Array[String]) 
  {
      var String = "Chavan"
      
      val height = 1.8d
      val name = "James"
      
      //Demo of String Interpolators  - "s" is the interpolator that allows to process string
      println(s"Sachin $String")
      println(s"1 + 1 = ${1 + 1}")
      
      //Demo of String Interpolators  - "f" is the interpolator that allows to process string
      println(f"$name%s is $height%2.2f meters tall")
      
      //Demo of String Interpolators  - "raw" is the interpolator that allows to process string
      println(s"Result = \n a \n b")
      
      //In "raw" interpolators it doesnt result in new line \n
      println(raw"Result = \n a \n b")
  }
}
