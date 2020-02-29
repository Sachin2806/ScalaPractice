package com.tgt.Practice.Misc

import scala.collection.immutable 
import scala.collection.mutable._

object ProgramMisc9
{
  def main(args: Array[String])
  {
    println(listAnalysis(Nil))
    println(listAnalysis(List('a','b')))
    println(listAnalysis(List(1,2,3,4,5)))
    println(listAnalysis(List(4,2,3,4,5)))
    println(listAnalysis(List('b','a')))
    
    println()
    println(doubleMatch(1, "test"))
    println(doubleMatch(1, 'b'))
    println(doubleMatch(42, Nil))
    println(doubleMatch('a', 'b'))
    println(doubleMatch(4.2f, 42))
    println()
    
    println(sequencesPatternMatching(List(3)))
    println(sequencesPatternMatching(List(2,3,5, 6)))
    println(sequencesPatternMatching(Vector(1,2)))
    println(sequencesPatternMatching()) 
    
    println()
    println(tuplesPatternMatching((1, 2)))
    println(tuplesPatternMatching((1, 2, 3)))
    println(tuplesPatternMatching((1, 2, 3, 4)))
    
    println()
    println(typedPatternMatching(("Sachin")))
    println(typedPatternMatching((12)))
    println(typedPatternMatching((List(1,2))))
    
    println()
    println(regexPatterns(("A")))
    println(regexPatterns(("12")))
    println(regexPatterns(("3A")))
    println(regexPatterns(("-")))
    
    println()
    println(patternGuards(List(1,2,3,4),3))
    println(patternGuards(List(1,2,3,4),6))
    println(patternGuards(("Sachin"),3))
    println(patternGuards(("Sachin"),6))
    println(patternGuards(Set("Sachin"),3))
  }
  
  def doubleMatch(foo: Any, bar: Any) = (foo, bar) match 
  {
    case ('a', 'b') => "a and b"
    case (1, 'b') => "1 and b"
    case (1, _) => "1 and "+ bar
    case (a:Float, _) => "foo float"
    case _ => "unknown case"
  }
  
  def listAnalysis(list: List[Any]) = list match 
  {
   case Nil => "empty"
   case 'a' :: tail => "Starting by 'a'"
   case (head:Int) :: _ if head > 3 => "starting by an int greater than 3"
   case (head:Int) :: _ => "starting by an int"
   case _ => "whatever"
  }
  
  def sequencesPatternMatching(sequence: Any): String = 
  {
  sequence match 
  {
    case List(singleElement) => s"I'm a list with one element: $singleElement"
    case List(_, _*) => s"I'm a list with one or multiple elements: sequence"
    case Vector(1, 2, _*) => s"I'm a vector: $sequence"
    case _ => s"I'm an unrecognized sequence. My value: $sequence"
  }
  }
  
  def tuplesPatternMatching(tuple: Any): String = 
  {
    tuple match 
    {
      case (first, second) => s"I'm a tuple with two elements: $first & $second"
      case (first, second, third) => s"I'm a tuple with three elements: $first, $second & $third"
      case _ => s"Unrecognized pattern. My value: $tuple"
    }
  }
  
  def typedPatternMatching(any: Any): String = {
  any match {
    case string: String => s"I'm a stringm my value is : $string"
    case integer: Int => s"I'm an integer, my value is : $integer"
    case _ => s"I'm from an unknown type, my value is  : $any"
  }
}
  
  def regexPatterns(toMatch: String): String = {
  val numeric = """([0-9]+)""".r
  val alphabetic = """([a-zA-Z]+)""".r
  val alphanumeric = """([a-zA-Z0-9]+)""".r
 
  toMatch match {
    case numeric(value) => s"I'm a numeric with value : $value"
    case alphabetic(value) => s"I'm an alphabetic with value : $value"
    case alphanumeric(value) => s"I'm an alphanumeric with value : $value"
    case _ => s"I contain other characters than alphanumerics. My value is : $toMatch"
  }
}
  
  def patternGuards(toMatch: Any, maxLength: Int): String = {
  toMatch match {
    case list: List[Any] if (list.size <= maxLength) => "List is of acceptable size"
    case list: List[Any] => "List has not an acceptable size"
    case string: String if (string.length <= maxLength) => "String is of acceptable size"
    case string: String => "String has not an acceptable size"
    case _ => "Input is neither a List nor a String"
  }
}
  

}

  