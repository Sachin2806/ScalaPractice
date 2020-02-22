package com.tgt.Practice.Collections
import scala.collection.mutable._

object ProgramSet5 {
  
  def main(args: Array[String]){
    
    val s1 = Set(5, 12, 3, 13)  
    val s2 = Set(5, 12, 10)
    val s3 = Set(5, 12)
    val s4 = Set(4, 5, 12, 20, 36)
    val s5 = Set(4, 12, 20, 36)
    val s6 = Set(4, 12, 20, 37)
    val s7 = Set(6, 8, 9)
    val s8 = Set(1, 2, 3, 4, 1)  
    
    val result1 = s1.find(_ == 3)
    val result2 = s1.find(_ == 2)
    
    val result4 = s4.exists(x => (x % 2 != 0)) 
    val result5 = s4.exists(x => (x % 7 == 0))
    
    val result6 = s5.forall(x => (x % 4 == 0))
    val result7 = s6.forall(x => (x % 4 == 0))
    
    val result8 = s6.contains(12)
    val result9 = s6.contains(11)
    
    val result10 = s1.&(s2)
    val result11 = s1.&(s7)
    
    val result12 = s1.&~(s2)
    val result13 = s2.&~(s1)
    
    println("Demo of find in Sets 			: " + result1)
    println("Demo of find in Sets 			: " + result2)
   
    println("Demo of product in Sets 		: " + s2.product)
    
    println("Demo of subsetOf in Sets 		: " + s3.subsetOf(s1))
    println("Demo of subsetOf in Sets 		: " + s1.subsetOf(s3))
    
    println("Demo of exists in Sets 			: " + result4)
    println("Demo of exists in Sets 			: " + result5)
    
    println("Demo of forall in Sets 			: " + result6)
    println("Demo of forall in Sets 			: " + result7)
   
    println("Demo of contains in Sets 		: " + result8)
    println("Demo of contains in Sets 		: " + result9)
    
    println("Demo of & in Sets 			: " + result10)
    println("Demo of & in Sets 			: " + result11)    
    println("Demo of &~ in Sets 			: " + result12)   
    println("Demo of &~ in Sets 			: " + result13)   
    
    println("Demo of take in Sets 			: " + s8.take(4))
    println("Demo of take in Sets 			: " + s4.take(3))    
    
    println("Demo of takeRight in Sets 		: " + s8.takeRight(4))
    println("Demo of takeRight in Sets 		: " + s4.takeRight(3))
    
  }
  
}