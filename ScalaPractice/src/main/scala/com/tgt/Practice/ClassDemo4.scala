package com.tgt.Practice

// A Scala program to illustrate the Initialization of an object

object ClassDemo3 
{
  
  def main(args: Array[String]): Unit = 
  {
  
  //var obj = new Dog("Tuffy", "Pappilon", 5, "White")
  
  class Dog(name: String, breed: String, age: Int, color: String)
    {
      println("My name is : " + name + "My breed is : " + breed)
      println("My age is : " + age + "my color is : " + color)
    }
      
  }
}

