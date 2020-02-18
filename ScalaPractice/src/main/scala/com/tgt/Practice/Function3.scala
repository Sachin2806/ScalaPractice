package com.tgt.Practice

object Function3{
  
  def main(args: Array[String]){
    
    val str1:String = "Hello "
    val str2:String = "Scala!"
    
    println("str1 + str2 = " + strcat(str1)(str2))
  
  //Simple example to show the currying concept..
  
    def strcat(s1: String)(s2: String) = {
      s1 + s2
  
  }
  }
}