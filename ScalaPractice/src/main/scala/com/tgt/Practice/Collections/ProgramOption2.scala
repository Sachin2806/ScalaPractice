package com.tgt.Practice.Collections

import scala.collection.immutable 
import scala.collection.mutable._

object ProgramOption2 {
  
  def main(args: Array[String]){
    
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None
    
    println("Demo of get() Method in Options			: " + a.get)
    //Below statement will fail as there is no optional value
    //println("Demo of get() Method 	: " + b.get)
        
    //Following is the example program to show how to use getOrElse() method to access a value 
    //or a default when no value is present.
    println("Demo of getOrElse() Method in Options		: " + a.getOrElse(0))
    println("Demo of getOrElse() Method in Options		: " + b.getOrElse(10))
    
    //Following is the example program to show how to use isEmpty() method to check if the option is None or not. 
    println("Demo of isEmpty() Method in Options		: " + a.isEmpty)
    println("Demo of isEmpty() Method in Options		: " + b.isEmpty)
    
    println("Demo of productArity() Method in Options	: " + a.productArity)
    println("Demo of productArity() Method in Options	: " + b.productArity)
    
    println("Demo of productElement() Method 		: " + a.productElement(0))
    //Below statement will fail as there is no element for this product and hence commented
    //println("Demo of productElement() Method 	: " + b.productElement(1))
    
    println("Demo of exists() Method in Options		: " + a.exists(x => (x % 2 != 0 )))    
    println("Demo of filter() Method in Options		: " + a.filter(x => (x % 2 != 0 )))  
    
    println("Demo of filterNot() Method in Options		: " + a.filterNot(x => (x % 2 != 0 )))  
    println("Demo of filterNot() Method in Options		: " + a.filterNot(x => (x % 2 == 0 )))  
    
    println("Demo of isDefined() Method in Options		: " + a.isDefined)
    println("Demo of isDefined() Method in Options		: " + b.isDefined)
    
    println("Demo of Iterator in Options 			: " )
    for(i<-a.iterator){println(i)}
    
    println("Demo of map() Method in Options			: " + a.map(x => (x * x)))
    
  }
  
}