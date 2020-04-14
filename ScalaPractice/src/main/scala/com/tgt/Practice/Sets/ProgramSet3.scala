package com.tgt.Practice.Sets

//import scala.collection.immutable 
import scala.collection.mutable._

object ProgramSet3 {
  
  def main(args: Array[String]){
    
    // Scala program to illustrate how to delete items using retain(), and clear() methods 
    // in mutalbe set with mutable collection 
    
    var myset1 = Set(100, 400, 500, 600,300, 800) 
    var myset2 = Set(11, 44, 55, 66, 77) 
    var myset3 = Set(100, 400, 500, 600,300, 800, 900, 200) 
    
    println("Set before deletion:") 
    println(myset1) 
    println(myset2) 
        
    // Deleting elements in set using retain() method     
    myset1.retain(_>500)
    println("Deletion by using retain : " + myset1) 
    
    // Deleting elements in set using clear() method 
    myset2. clear 
    println("\nSet after using clear() method:") 
    println("Deletion by using Clear : " + myset2) 
    
    // Deleting elements in set using retain() method     
    myset3.retain(_>1000)
    println("Deletion by using retain : " + myset3) 
  }
}
