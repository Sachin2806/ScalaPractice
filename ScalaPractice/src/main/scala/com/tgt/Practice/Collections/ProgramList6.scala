package com.tgt.Practice.Collections

//import scala.collection.immutable 

object ProgramList6 {
  
  def main(args: Array[String]){
    
        val data = List("a", "b", "c", "d", "e", "f")
        val arr1 = data.toArray
        val lst1 = List(5, 6, 7)      
 
        val arr = new Array[Int](7)
        val lst = List(5, 6, 7)
      
        //println("Demo of copyToArray : " + arr1.mkString(","))
        lst.copyToArray(arr, 2)
        println("Demo of copyToArray : " + arr.mkString(","))
        
        println("Demo of toArray : " + arr1.mkString(","))
        println("Demo of toList : " + data.mkString(","))
        
  }
}
