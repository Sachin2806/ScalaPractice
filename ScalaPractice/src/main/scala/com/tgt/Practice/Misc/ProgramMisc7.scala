package com.tgt.Practice.Misc

import scala.collection.immutable 
import scala.collection.mutable._

object ProgramMisc7
{
  def main(args: Array[String])
  {
    val commonList = List(1, 2, 3, 4, 5)
    val emptyList = Nil
    val oneElement = 'a' :: Nil 
    
    println("Values in common list 		 : " + checkList(commonList))
    println("Values in emptyList  		 : " + checkList(emptyList))
    println("Values in oneElement list 	 : " + checkList(oneElement))
    
    val  a = 3 match 
    {
      case 1 => println("Value is 1")
      case 2 => println("Value is 2") 
      case _ => println("Value is default") 
    }
    
    //Using match with if-expressions in the below example
    val  b = 3 match 
    {
      case m if m > 3 => println("Value of m is less than 3")
      case m if m == 3 => println("Value of m is equal to 3") 
      case _ => println("Value is default") 
    }
    
    //Using Some, None option match
    
    val result = getOption(2)
    
    result match 
    {
      case Some(x) =>  println("Value exists")
      case None =>     println("Value doesnt exist")
    }
    println("Another Pattern Matching Demo    : " + describe("five"))
  }
  
  def getOption(n: Int): Option[Int] = if (n >= 3) Some(n) else None
  def checkList[T](list: List[T]): String = list match 
  {
    case Nil => "Empty list"
    case list :: Nil => "One element"
    case _ => "More than one element"
  }
  
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }
  
  
}
