package com.tgt.Practice.Collections

//import scala.collection.immutable 
//mport scala.collection.mutable._

object ProgramTuple1 {
  
  def main(args: Array[String]){
    
    val num = (4, 6, 11, 23)
    val sum = num._1 + num._2 + num._3 + num._4
    
    val r = ("Scala", "Hello")
    val s = (1, "hello", Console)
    val t = new Tuple3(1, "hello", Console)
    
    
    println("Sum of the Tuple is : " + sum)
    
    //Tuple.productIterator() method is to iterate over all the elements of a Tuple.
    num.productIterator.foreach
    {
      i => println("Value of the Tuple  : " + i)
    }
    
    //Tuple.toString() method to concatenate all the elements of the tuple into a string.
    println("Demo of toString in Tuples : " + s.toString())
    println("Demo of toString in Tuples : " + t.toString())
    
    //Tuple.swap method to swap the elements of a Tuple2.
    println("Demo of swap in Tuples : " + r.swap)
  }
  
}