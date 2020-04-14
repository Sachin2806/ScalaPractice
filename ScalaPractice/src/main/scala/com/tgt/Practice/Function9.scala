package com.tgt.Practice

import java.util.Date

object Function9{
  
  def main(args: Array[String]) 
  {
      printStrings("Hello", "Scala", "Python")
   }
   
  //simple example to show the function with arguments.
   def printStrings(args:String* ) = 
   {
     var i : Int = 0;
      
      for( arg <- args )
      {
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
     }
}
}
