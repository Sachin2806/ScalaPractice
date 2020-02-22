package com.tgt.Practice.Collections
import scala.collection.mutable.Set
import scala.collection.mutable._

object ProgramMap3 {
  
  def main(args: Array[String]){
    
    val names = Map("sachin" -> "Engineer", "Ambika" -> "HouseWife", "Shubham" -> "Student", "Kavita" -> "Lecturer")
    val m1 = Map("geeks" -> 5, "for" -> 3, "cs" -> 2)
    val m2 = Map("geeks" -> 5, "for" -> 3, "cs" -> 2)
    val m3 = Map("geeks" -> 5, "for" -> 3, "cs" -> 2, "fo" -> 4)
    val m4 = Map(3 -> "geeks", 4 -> "for", 2 -> "cs") 
    val m5 = Map(3 -> "geeks", 4 -> "for", 4 -> "for") 
    
    val myMap = Map(1 -> List(10), 2 -> List(20, 200)).withDefaultValue(Nil)
    
    println("Demo of find in Maps				: " + m1.find(_._2 == 5))
    println("Demo of find in Maps				: " + m1.find(_._2 == "for"))
    println("Demo of find in Maps				: " + m1.find(_._1 == "for"))
    
    println("Demo of transform in Maps			: " + m4.transform((key,value) => value.toUpperCase) )
    
    println("Demo of filter in Maps				: " + m3.filter(x => (x._1 == "for" && x._2 == 3)))
    println("Demo of filter in Maps				: " + m3.filter(x => (x._1 == "for" && x._2 == 5)))
    
    println("Demo of filterKeys in Maps			: " + m4.filterKeys(_ > 2))
    println("Demo of filterKeys in Maps			: " + m4.filterKeys(_ > 4))
   
    println("Demo of exists in Maps				: " + m3.exists(x => x._1 == "for" && x._2 == 3))
    println("Demo of exists in Maps				: " + m3.exists(x => x._1 == "for" && x._2 == 2))
    
    println("Demo of retain in Maps				: " + m4.retain((key,value) => key > 1))
    
    //In Scala, the sum or product of the map elements can be done by utilizing foldLeft method.
    println("Demo of foldLeft in Maps			: " + m4.foldLeft(1)(_*_._1))
    println("Demo of foldLeft in Maps			: " + m5.foldLeft(1)(_*_._1))
    println("Demo of foldLeft in Maps			: " + m5.foldLeft(0)(_+_._1))
    
    println("Demo of mkString in Maps			: " + m5.mkString)
    println("Demo of withDefaultValue in Maps		: " + myMap(2))
    println("Demo of withDefaultValue in Maps		: " + myMap(3))
  }
  
}