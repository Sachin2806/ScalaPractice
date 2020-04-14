package com.tgt.Practice.Lists

object ProgramList1 {
  
  def main(args: Array[String]){
    
    //Lists defined for various data types
    val fruit = List("apples", "oranges", "pears")
    val num = List(1, 2, 3, 4, 5)
    val emptyList = List()
    val dim = List(List(1, 0, 0),List(0, 1, 0), List(0, 0, 1))
    
    fruit.foreach(println)
    num.foreach(println)
    emptyList.foreach(println)
    dim.foreach(println)
    println()
    
    //returns head of the list
    println("Head in List : " + fruit.head)
    
    //returns a list consisting of all elements except the first
    println("Tail in List : " + fruit.tail)
    
    //returns true if the list is empty otherwise false.
    println("isEmpty in List : " + fruit.isEmpty)
    println("isEmpty in List : " + emptyList.isEmpty)
  }
  
}