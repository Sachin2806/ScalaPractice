package com.tgt.Practice.Collections

import scala.collection.SortedSet
import scala.collection.mutable._

object ProgramSet2 {
  
  def main(args: Array[String]){
    
    //SortedSet to sort a Set
    val mySet = SortedSet(87, 0, 3, 45, 7, 56, 8,6)
    var myset1 = Set("G", "Geek", "for") 
    var myset2 = Set(100, 400, 500, 600, 300, 800) 
    println("Set before addition of new elements	:") 
    println(myset1)
    println()
    
    println("Set before Deletion of elements	:") 
    println(myset2)
    
    // Deleting elements in set using -= and --= methods 
    myset2 -= 600
    myset2 --== List(300,100)
    
    println("\nSet after deletion:") 
    println(myset2) 
        
    // Adding new element in set using += and ++==  
    myset1 += "Geeks"
    myset1 += "Genius"
    
    // Here, "G" is already present in the Set so, "G" is not added in set 
    myset1 ++== List("Geeks12", "geek23", "G")
    
    // Adding elements using add() method 
    myset1.add("GeeksforGeeks") 
    myset1.add("geeksForgeeks100") 
    myset1.+("a")
    println("\nSet after addition of new elements	:") 
    println(myset1) 
        
    println()
    mySet.foreach(println)
    
  }
}