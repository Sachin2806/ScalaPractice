package com.tgt.Practice.Misc

object ProgramMisc3 {
  
  // Scala iterator program for maximum valued element user defined method 
  
  def main(args: Array[String])
  {
      val i = Iterator(5, 1, 2, 3, 6, 4) 
      println("Maximum : " + large(i))
      
  }
  
  def large(ite:Iterator[Int]): Int = 
  {
    var mx = ite.next 
  
    for(i <- ite) 
     if(i > mx) mx = i 
     mx 
  }
  
  
}