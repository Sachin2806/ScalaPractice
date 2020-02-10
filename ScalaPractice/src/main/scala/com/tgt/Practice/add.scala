package com.tgt.Practice

object add {
  def main(args: Array[String]): Unit = 
  {
    println("value of sum = " + addInt(100, 20))
  }
  
  def addInt(a:Int, b:Int) : Int = 
  {
    var sum = 0
    sum = a + b
    return sum    
  }
  
}