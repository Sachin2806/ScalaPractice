package com.tgt.Practice

object ClassDemo2 {
  
  def main(args: Array[String]): Unit = {
   
//    //Demo of class User
//    class User(var name: String, var age: Int);
//    
//    var user = new User("Sachin", 36)
//    
//    println(user.name)
//    println(user.age)
   
   //Demo of class Point
   class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
    val pt = new Point(10, 20);

    // Move to a new location
    pt.move(10, 10);
      
  }
}

