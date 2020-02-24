package com.tgt.Practice.Misc

object ProgramMisc4 {
  
  def main(args: Array[String]){
    
    println("Details of the matchDetails 	: " + matchDetails(3))
    println("Details of the matchTest   	 : " + matchTest(1))
    println("Details of the matchTest	   : " + matchTest("eight"))
    println("Details of the matchTest	   : " + matchTest("a"))
    println("Details of the matchTest	   : " + matchTest("y"))
  }
  
  def matchTest(id: Any): Any = id match
  {
    
    case 1 => "Printing 1"
    case "eight" => "Printing eight"
    case "a" => "Printing a"
    case 3 => "Printing 3"
    case y: Int => "Scala.Int"
    case _ => "Default"
  }
  
  def matchDetails(id:Int): String  = id match
  {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "Default"
  }
  
}