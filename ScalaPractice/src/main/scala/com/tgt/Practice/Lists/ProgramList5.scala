package com.tgt.Practice.Lists

object ProgramList5 {
  
  def main(args: Array[String]){
    
      //Methods in List
    
      val a = List(1,2,3)
      val d = List(4,5,6,7,8,3)
      
      val data = List("a", "b", "c", "d", "e", "f")
      val arr = data.toArray
      
      var b = new StringBuilder()
      var c = new StringBuilder()
            
      println("Demo of + in Scala Lists 					: " + a.+("4"))
      println("Demo of .::: in Scala Lists 					: " + a.:::(List(4,5,6)))
      println("Demo of .:: in Scala Lists 					: " + a.::("4"))
      println("Demo of String Builder in Scala List 				: " + a.addString(b))
      println("Demo of String Builder in the List with an separator 		: " + d.addString(c, "-"))
      println("Demo of Apply							: " + d.apply(4))
      println("Demo of Contains						: " + d.contains(5))
      println("Demo of Contains						: " + a.contains(5))
      
  }
}
