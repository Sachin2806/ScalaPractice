package com.tgt.Practice.Misc

import scala.util.Random

object ProgramMisc5 
{
  def main(args: Array[String])
  {
    val x: Int = Random.nextInt(5)
    
    x match {
      case 0 => println("Zero")
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("Many")
    }
    
    
    matchFunction(2) //two
    matchFunction(5) //unknown number
    
    1 + 2 - 3 + 4 - 5 match {
    case -1 => println("minus one")
    case 0  => println("zero")
    case 1  => println("one")
    case _  => println("unknown")
  }
  
  //Using pattern matching in a function and use underscore in case when all previous patterns are not matched.
  def matchFunction(v: Int) = v match {
  case 1 => println("one in matchFunction Method")
  case 2 => println("Two in matchFunction Method")
  case _ => println("Unknown number in matchFunction Method")
}
  //Match expression to constants.
  val boo = 5 < 10 match
  {
    case true => println("True") 
    case false => println("False") 
  }
    
  }
  
}