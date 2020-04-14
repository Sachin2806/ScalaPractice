package com.tgt.Practice.Collections

//import scala.collection.immutable 
import scala.collection.mutable._

object ProgramSet4 {
  
  def main(args: Array[String]){
    
    // Scala program to illustrate how to add elements in immutable set 
    
    // Creating and initilazing immutable set 
        val myset1 = Set(100, 400, 500, 600,300, 800) 
        val myset2 = Set(11, 44, 55, 66, 77) 
        println("Set before addition:") 
        println(myset1) 
        println(myset2) 
        println("\nSet after addition:") 
          
        // Add single element in myset1 and create new Set 
        val S1 = myset1 + 900
        println("Demo of + in Sets : " + S1) 
          
        // Add multiple elements in myset1 and create new Set 
        val S2 = myset1 + (200, 300) 
        println("Demo of + in Sets : " + S2) 
          
        // Add another list into myset1 and create new Set 
        val S3 = myset1 ++ List(700, 1000) 
        println("Demo of + in Sets : " + S3) 
          
        // Add another set myset2 into myset1 and create new Set 
        val S4 = myset1 ++ myset2
        println("Demo of + in Sets : " + S4)  
        println()
        
        // Scala program to illustrate how to remove elements in immutable set 
        // Creating and initilazing immutable set 
        val myset = Set(100, 400, 500, 600,  
                        300, 800, 900, 700) 
        println("Set before deletion:") 
        println(myset) 
      
        println("\nSet after deletion:") 
          
        // Remove single element in myset and  Result store into new variable 
        val S5 = myset - 100
        println("Demo of - in Sets : " + S5) 
          
        // Remove multiple elements from myset Result store into new variable 
        val S6 = myset - (400, 300) 
        println("Demo of - in Sets : " + S6) 
          
        // Remove another list from myset Result store into new variable 
        val S7 = myset -- List(700, 500) 
        println("Demo of - in Sets : " + S7) 
        
        // Scala program to illustrate union, intersection, and difference on Set  
        
        // Creating and initializing set 
        val myset3 = Set(11, 22, 33, 44, 55, 66, 77, 111) 
        val myset4 = Set(88, 22, 99, 44, 55, 66, 77) 
          
        // To find intersection  
        val S8 = myset3.intersect(myset4) 
        println() 
        println("Demo of intersection in Sets 		: " + S8) 
          
        // To find the symmetric difference  
        val S91 = myset3.diff(myset4) 
        println("Demo of difference in Sets 		: " + S91) 
        
        // To find the symmetric difference  
        val S92 = myset4.diff(myset3) 
        println("Demo of difference in Sets 		: " + S92) 
          
        // To find union 
        val S10 = myset3.union(myset4) 
        println("Demo of union in Sets 			: " + S10) 
        
  }
}
