package com.tgt.Practice

object Hello 
{
  def PrintMe() : Unit = {
    
    println("Hello Sachin")
  }


def main(args: Array[String]): Unit = 
{
  println("When no Return Type :" + PrintMe())
}

}