package com.tgt.Practice.Arrays
import scala.Array._

object Example4 {
  
  def main(args: Array[String]){
    
   // Declaring an array 
    val a = Array(45, 52, 61)  
    println("Values of Array a :") 
    for ( x <- a )  
    { 
      println( x ) 
    } 
    
    // Appending 1 item 
    val b = a :+ 27 
    println()
    println("Values of Array b : ") 
    for ( x <- b )  
    { 
      println( x ) 
    } 
    
    // Appending 3 items
    val c = b ++ Array(37,48, 56)
    println()
    println("Values of Array b : ") 
    for ( x <- c )  
    { 
      println( x ) 
    } 
    
    // Pre-pending 1 item
    val d = 15 +: a 
    println()
    println("Values of Array d : ") 
    for ( x <- d )  
    { 
      println( x ) 
    } 
    
    // Appending 3 items
    val e = Array(1, 6, 3, 24) ++: d  
    println()
    println("Values of Array b : ") 
    for ( x <- e )  
    { 
      println( x ) 
    } 
    
  }
}