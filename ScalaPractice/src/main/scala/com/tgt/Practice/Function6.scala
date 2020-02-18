package com.tgt.Practice

object Function6{
  
  def main(args: Array[String]) {
        delayed(time());
   }

  //Simple example shows how to implement call–by–name
   def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("First this function is called i.e delayed method")
      println("Param: " + t)
   }
}