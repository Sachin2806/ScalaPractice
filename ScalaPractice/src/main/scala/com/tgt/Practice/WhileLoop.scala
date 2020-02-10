package com.tgt.Practice

object WhileLoop {
  
  def main(args: Array[String]){
    
    //Local variable declaration
    var a = 10;
    
    //Do While loop Execution
    
    do{
      println("Value of a: " + a)
      a = a + 1
    }while(a < 20)
    
  }
}