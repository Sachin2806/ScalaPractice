package com.tgt.Practice.Final

import scala.util.matching.Regex

object ProgRegExp2 {
  
  def main(args: Array[String]){
    
    //Using the .r method on a String is the easiest way to create a Regex object.
    val numPattern1 = "[0-9]+".r
    
    //Using the .r method on a String is the easiest way to create a Regex object.
    val numPattern2 = new Regex("[0-9]+")    
    
    val address = "#204 9th main Mallesh Palya 560075"
    val address1 = "No address given"
    
    val match1 = numPattern1.findAllIn(address).toArray
    val match2 = numPattern1.findAllMatchIn(address).mkString(",")
    
    val match3 = numPattern2.findFirstIn(address).toArray
    val match4 = numPattern2.findFirstIn(address).mkString(",")
    val match5 = numPattern2.findFirstIn(address)
    val match6 = numPattern2.findFirstIn(address1)

    match1.foreach(println)
    println()
    println("Values in Match2 : " + match2)
        
    println()
    match3.foreach(println)   
    println("Values in Match4 : " + match4)
    
    println(match5)
    println(match6)
  }
}