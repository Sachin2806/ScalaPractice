package com.tgt.Practice.Lists

//import scala.collection.immutable 

object ProgramList8 {
  
  def main(args: Array[String])
  {
    val abc = List("A", "B", "C")
    val xs = List(1, 2, 3, 4)
    
    abc.reduceLeft(addLeft)
    abc.foldLeft("z")(addLeft)
    abc.scanLeft("z")(addLeft)
    
    println()
    abc.reduceRight(addRight)
    abc.foldRight("z")(addRight)
    abc.scanRight("z")(addRight)
    
    println()
    xs.reduceLeft(minusLeft)
    println()
    xs.foldLeft(0)(minusLeft)
    println()
    xs.scanLeft(0)(minusLeft)
    
    println()
    xs.reduceLeft(minusRight)
    println()
    xs.foldLeft(0)(minusRight)
    println()
    xs.scanLeft(0)(minusRight)
    
 }
  
  def addLeft(res: String, x: String) = 
  { 
    println(s"op: $res + $x = ${res + x}")
    res + x
  }
  
  def addRight(x: String, res: String) = 
  {
    println(s"op: $x + $res = ${x + res}")
    x + res
  }
  
  def minusLeft(a:Int, b:Int):Int = 
  {
    println(s"op: $a - $b = ${a - b}")
    a-b 
  }
  
  def minusRight(a:Int, b:Int):Int = 
  {
    println(s"op: $a - $b = ${a - b}")
    a-b 
  }
  
}
