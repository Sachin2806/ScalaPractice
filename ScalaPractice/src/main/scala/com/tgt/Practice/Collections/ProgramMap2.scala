package com.tgt.Practice.Collections
import scala.collection.mutable.Set
import scala.collection.mutable._

object ProgramMap2 {
  
  def main(args: Array[String]){
    
    val names = Map("sachin" -> "Engineer", "Ambika" -> "HouseWife", "Shubham" -> "Student", "Kavita" -> "Lecturer")
    val m1 = Map("geeks" -> 5, "for" -> 3, "cs" -> 2)
    val m2 = Map("geeks" -> 5, "for" -> 3, "cs" -> 2)
    val m3 = Map("geeks" -> 5, "for" -> 3, "cs" -> 2, "fo" -> 4)
   
    println("Demo of count in Maps				: " + names.count(x => true))
    println("Demo of init in Maps				: " + names.init)
    println("Demo of last in Maps				: " + names.last)
    println("Demo of size in Maps				: " + names.size)
    println("Demo of equals in Maps				: " + m1.equals(m2))
    println("Demo of equals in Maps				: " + m1.equals(m3))
    println("Demo of max in Maps				: " + names.max)
    println("Demo of min in Maps				: " + names.min)
    
    println("Demo of get in Maps				: " + m1.get("for"))
    println("Demo of get in Maps				: " + m1.get("each"))
    
    println("Demo of take in Maps				: " + names.take(1))
    println("Demo of takeRight in Maps			: " + names.takeRight(2))
    //println("Demo of takeWhile in Maps				: " + names.takeWhile(p))
    
    println("Demo of - in Maps				: " + m2.-("cs"))
    println("Demo of apply in Maps				: " + names.apply("sachin"))
    
    names.foreach(x => println("Key = " + x._1, " Value = " + x._2))
    
  }
  
}