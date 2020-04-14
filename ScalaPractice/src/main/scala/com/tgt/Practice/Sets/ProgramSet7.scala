package com.tgt.Practice.Collections
import scala.collection.mutable.Set
import scala.collection.mutable._

object ProgramSet7 {
  
  def main(args: Array[String]){
    
    val s1 = Set(1, 2, 3, 4, 5)  
   
    val s2 = Set(1, 2, 3, 4) 
    val arr = new Array[Int](7)
    val s3 = s1.toArray
    
    val s4 = Set((1, 2), (3, 4), (5, 6))  
    val s5 = Set()
    
    val a = new StringBuilder()
    val b = new StringBuilder()
    
    s2.copyToArray(arr, 2)
    
    println("Demo of copyToArray 					: " + arr.mkString(","))      
    println("Demo of toString in Sets 				: " + s1.toString())
    println("Demo of toArray in Sets 				: " + s3.mkString(","))
    println("Demo of toList in Sets 					: " + s1.toList)
    println("Demo of toBuffer in Sets 				: " + s1.toBuffer)
    println("Demo of toSeq in Sets 					: " + s1.toSeq)
    println("Demo of toMap in Sets 					: " + s4.toMap)
    
    println("Demo of filter in Sets 					: " + s1.filter(_ > 1))
    println("Demo of filter in Sets 					: " + s1.filter(_ > 10))
    
    println("Demo of count in Sets 					: " + s1.count(x => true))
    println("Demo of count in Sets 					: " + s5.count(x => true))
    
    println("Demo of map() in Sets 					: " + s1.map(x => (x * x)))
    println("Demo of map() in Sets 					: " + s1.map(x => (x / 2)))
    
    println("Demo of String Builder in Scala List 			: " + s1.addString(a))
    println("Demo of String Builder in Scala List 			: " + s1.addString(b, ","))     
     
  }
  
}