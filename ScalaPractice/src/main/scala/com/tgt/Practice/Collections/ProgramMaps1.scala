package com.tgt.Practice.Collections

import scala.collection.mutable.Set
import scala.collection.mutable._


object ProgramMaps1 {
  
  def main(args: Array[String]){
    
    val names = Map("sachin" -> "Engineer", "Ambika" -> "HouseWife", "Shubham" -> "Student", "Kavita" -> "Lecturer")
    val names1 = Map("sachin" -> "Engineer", "Ambika" -> "HouseWife", "Shubham" -> "Student", "Kavita" -> "Lecturer")
    val names2 = Map("Veena" -> "Teacher", "Arun" -> "Owner", "Deepu" -> "HR")
    val names5 = Map("Veena" -> "Teacher", "Arun" -> "Owner", "Deepu" -> "HR")
    val names6 = Map("Veena" -> "Teacher", "Arun" -> "Owner", "Deepu" -> "HR")
    
    val nums:Map[Char, Int] = Map()
    
    println("Demo of Keys in Maps 		: " + names.keys)
    println("Demo of values in Maps	 	: " + names.values)
    println("Demo of isEmpty in Maps		: " + names.isEmpty)
    println("Demo of isEmpty in Maps 	: " + nums.isEmpty)
    
    var names3 = names1 ++ names2
    println( "Demo of ++ Operator in Maps 	: " + names3)
    
    var names4 = names1.++:(names2)
    println( "Demo of .++ Operator in Maps 	: " + names4)
    
    var names7 = names1.-("Veena")
    println( "Demo of - Operator in Maps 	: " + names7)
    
    println("Printing keys and vaues from a Map")
    names.keys.foreach
    {
      i => print( "Key = " + i + ",\t") 
           println("Value = " + names(i))
    }
    
    //Check for a key in Map
    println()
    if (names.contains("sachin"))
    {
      println("Key exists in the Map : " + names("sachin"))
    }
    else
    {
      println("Key doesnt exist in the Map")
    }
    
    if (names.contains("Alex"))
    {
      println("Key exists in the Map : " + names("Alex"))
    }
    else
    {
      println("Key doesnt exist in the Map ")
    }
   
    println("Values before updating in Map 	: " + names5)
    names5 += ("Arun" -> "Politician")
    println("Values After updating in Map 	: " + names5)
  }
}


