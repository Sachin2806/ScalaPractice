package com.tgt.Practice

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println("Demo of class working")
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}