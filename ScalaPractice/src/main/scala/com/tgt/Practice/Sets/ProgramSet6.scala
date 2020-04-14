package com.tgt.Practice.Sets
import scala.collection.mutable._

object ProgramSet6 {
  
  def main(args: Array[String]){
    
    val s1 = Set(1, 2, 3, 4, 5)
    val s5 = Set(2, 4, 6, 9)
    
    val s2 = Set("geeks", "for", "cs")  
    val s3 = Set("cs", "for", "geeks")
    val s4 = Set("ss", "for", "geeks")  
        
    println("Demo of mkString in Sets 			: " + s1.mkString)
    println("Demo of mkString in Sets 			: " + s1.mkString(","))
    
    println("Demo of splitAt in Sets 			: " + s1.splitAt(2))
    println("Demo of splitAt in Sets 			: " + s1.splitAt(3))
    
    println("Demo of last in Sets 				: " + s1.last)
    
    println("Demo of equals in Sets 				: " + s2.equals(s3))
    println("Demo of equals in Sets 				: " + s3.equals(s4))
    
    println("Demo of sum in Sets 				: " + s1.sum)
    println("Demo of init in Sets 				: " + s1.init)
    println("Demo of size in Sets 				: " + s1.size)
    
    println("Demo of apply in Sets 				: " + s1.apply(2))
    println("Demo of apply in Sets 				: " + s1.apply(6))
    
    println("Demo of drop in Sets 				: " + s1.drop(1))
    println("Demo of drop in Sets 				: " + s1.drop(4))
 
    println("Demo of dropRight in Sets 			: " + s1.dropRight(2))
    println("Demo of dropRight in Sets 			: " + s1.dropRight(3))
    
    println("Demo of dropWhile in Sets 			: " + s5.dropWhile(x=>{x % 2 != 0}))
    println("Demo of dropWhile in Sets 			: " + s5.dropWhile(x=>{x % 2 == 0}))
    
  }
  
}