package com.tgt.Practice.Collections
import scala.collection.mutable.Set
import scala.collection.mutable._

object ProgramMap5 {
  
  def main(args: Array[String]){
    
    val m1 = Map("Nidhi" -> 23, "Rahul" -> 18, "Nisha" -> 21, "Rohit" -> 16) 
    val m2 = Map("Nidhi" -> 23, "Rahul" -> 18, "Nisha" -> 21, "Rohit" -> 16)
    
    val m = Map("Nidhi" -> 23, "Rahul" -> 18) 
    val x: Array[Any] = Array(0, 0, 0, 0, 0)
    
    m.copyToArray(x)  
    for(m1 <- x) println("Demo of copyToArray : " + m1)
    
    val toArray1 = m.toArray
    
    println("Demo of toList in Maps					: " + m.toList)
    println("Demo of toSeq in Maps					: " + m.toSeq)
    println("Demo of toString in Maps				: " + m.toString)
    println("Demo of toBuffer in Maps				: " + m.toBuffer)
    println("Demo of toSet in Maps					: " + m.toSet)
    println("Demo of toArray in Maps					: ")
    toArray1.foreach(println)
    
    val reverse = for ((k, v) <- m1) yield (v, k)
    println(reverse)
    
    
  }
  
}