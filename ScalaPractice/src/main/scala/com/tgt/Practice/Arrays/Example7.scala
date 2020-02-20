package com.tgt.Practice.Arrays

import scala.reflect.ClassTag
import scala.collection.generic._
import scala.collection.{ mutable, immutable }
import mutable.{ ArrayBuilder, ArraySeq }
import scala.compat.Platform.arraycopy
import scala.reflect.ClassTag
import scala.runtime.ScalaRunTime.{ array_apply, array_update }


object Example7 {
  
  def main(args: Array[String]){
    
    val a = Array(10, 20, 30, 40, 10)
    println("Demo of Distinct")
    a.distinct.foreach(println)
    println()
    
    println("Demo of Drop(2)")
    a.drop(2).foreach(println)
    println()
    
    println("Demo of dropRight(2)")
    a.dropRight(2).foreach(println)
    println()
    
    println("Demo of dropWhile")
    a.dropWhile(_ < 25).foreach(println)
    println()
    
    println("Demo of filter")
    a.filter(_ < 25).foreach(println)   
    println()
    
    println("Demo of filter")
    a.filter(_ > 100).foreach(println)
    println()
    
    println("Demo of filterNot")
    a.filterNot(_ < 25).foreach(println) 
    println()
    
    println("Demo of find")
    a.find(_ > 20).foreach(println)
    println()
    
    println("Demo of head")
    a.head 
    println()
    
    println("Demo of headOption")
    a.headOption.foreach(println) 
    println()
    
    println("Demo of init")
    a.init.foreach(println)  
    println()
    
    println("Demo of intersect")
    a.intersect(Array(19,20,21)).foreach(println)
    println()
    
    println("Demo of last")
    a.last
    println()
    
    println("Demo of lastOption")
    a.lastOption.foreach(println)
    println()
    
    println("Demo of slice")
    a.slice(2,4).foreach(println)
    println()
    
    println("Demo of tail")
    a.tail.foreach(println)         
    println()
    
    println("Demo of take")
    a.take(3).foreach(println)
    println()
    
    println("Demo of takeRight")
    a.takeRight(2).foreach(println)
    println()
    
    println("Demo of takeWhile")
    a.takeWhile(_ < 30).foreach(println)
    println()
   
  }
}

  
