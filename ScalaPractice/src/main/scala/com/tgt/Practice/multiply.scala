package com.tgt.Practice

object multiply{
  
  def multiplyDouble(x:Double, y:Double) : Double = {
    var mul:Double = 0
    mul = x * y
    return mul
   }
  
   def main(args: Array[String]): Unit = 
   {
     println("Value after multiplication is = " + multiplyDouble(12.5,15.5))
   }
     
  }