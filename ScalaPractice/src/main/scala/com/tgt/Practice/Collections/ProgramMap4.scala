package com.tgt.Practice.Collections
import scala.collection.mutable.Set
import scala.collection.mutable._

object ProgramMap4 {
  
  def main(args: Array[String]){
    
    val m1 = Map("Nidhi" -> 23, "Rahul" -> 18, "Nisha" -> 21, "Rohit" -> 16) 
    val m2 = Map("Nidhi" -> 23, "Rahul" -> 18, "Nisha" -> 21, "Rohit" -> 16)
    
    val a = Map("Nidhi" -> 23, "Rahul" -> 18) 
    val b = Map("sonu" -> 16, "Nisha" -> 21) 
    val cl = Map("sonu" -> 16, "Nisha" -> 21) 
    
    val m = Map("Nidhi" -> 23, "Rahul" -> 18) 
    val n = Map("sonu" -> 16, "Nisha" -> 21) 
  
    val x = m.iterator
    val y = n.iterator
    
    val c = a.addString(new StringBuilder)
    val d = b.addString(new StringBuilder)    
    
    val e = a.addString(new StringBuilder(), ",")
    val f = b.addString(new StringBuilder(), ",")    
    
    println("Demo of iterator  in Maps				: " + x)
    println("Demo of iterator  in Maps				: " + y)    
    
    println("Demo of addString  in Maps				: " + c)
    println("Demo of addString  in Maps				: " + d)
    
    println("Demo of addString with Sep in Maps			: " + e)
    println("Demo of addString with Sep in Maps			: " + f)
    
    println("Demo of apply in Maps					: " + a.apply("Nidhi"))
    println("Demo of apply in Maps					: " + b.apply("sonu"))
    
    println("Demo of clear in Maps					: " + cl.clear())
    println("Demo of clone in Maps					: " + a.clone())
    
    println("Demo of drop in Maps					: " + m1.drop(1))
    println("Demo of drop in Maps					: " + m1.drop(2))
    println("Demo of dropRight in Maps				: " + m2.dropRight(2))
    println("Demo of dropWhile in Maps				: " + m2.dropWhile(z => true))
  
    println("Demo of empty in Maps					: " + m1.empty)
    println("Demo of remove in Maps					: " + m1.remove("Rohit"))
    
  
  }
  
}