package com.tgt.Practice

// A Scala program to illustrate how to create a class 
  
object main { 
      
    // Main method 
    def main(args: Array[String])  
    { 
        // Class object 
        var obj = new Smartphone(); 
        obj.Display(); 
    } 
// Name of the class is Smartphone 
class Smartphone 
{ 
    // Class variables 
    var number = 16
    var nameofcompany = "Apple"
      
    // Class method 
    def Display() 
    { 
        println("Name of the company \t\t: " + nameofcompany); 
        println("Total number of Smartphone generation: " + number); 
    } 
} 
} 
