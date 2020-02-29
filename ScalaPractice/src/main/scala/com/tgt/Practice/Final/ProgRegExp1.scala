package com.tgt.Practice.Final

import scala.util.matching.Regex

object ProgRegExp1 {
  
  def main(args: Array[String]){
    
    // Applying r() method 
    val pattern = "Scala".r
    val str = "Scala is Scalable and cool"
    
    val portal = "GeeksforGeeks".r
    val CS = "GeeksforGeeks is a CS portal."
    
    // Applying Regex class
    val x = new Regex("Sachin")
    val myself = "My name is Sachin Chavan"
   
    val Geeks = new Regex("(G|g)fG") 
    val y = "GfG is a CS portal. I like gfG"
    
    
    println(pattern findFirstIn str)
    println(portal findFirstIn CS )
    
    println(x replaceFirstIn(myself, "Ambika"))
    println((Geeks findAllIn y).mkString(", ")) 
    
  }
}