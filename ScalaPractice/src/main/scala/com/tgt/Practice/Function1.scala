package com.tgt.Practice

object Function1 {
  
  def main(args: Array[String]): Unit = {
    
  {
    println("value of sum = " + addInt())
  }
  
  //Example of specifying default parameters for a function
  def addInt(a:Int = 100, b:Int = 200) : Int = 
  {
    var sum = 0
    sum = a + b
    return sum    
  }
  
}

}