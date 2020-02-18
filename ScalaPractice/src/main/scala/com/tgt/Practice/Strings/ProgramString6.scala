package com.tgt.Practice.Strings

object ProgramString6 {
  
  //Example program, which makes use of printf() method −
   def main(args: Array[String]) 
  {
     //Below are different ways of using split method that can be used directly in your Scala programs  
     val result = "Sachin Chavan".split(" ").foreach(println)
     
     val s = "eggs, milk, butter, Coco Puffs"
     val result1 = s.split(",")
     
     val codes = "abc;def,ghi:jkl"
     val result2 = codes.split(Array(';', ',', ':'))
     
     // This string has an empty item between delimiters.
     val items = "box; ; table; chair"
     
     // Use a Regex to split the string.
     // ... Any number of spaces or semicolons is a delimiter.
    val result3 = items.split("[; ]+")

     //println("Demo of regionMatches : "+ result1.foreach(f))
     println()
     
     // Print all elements in array
     for (i <- result1)
     {
       println(i.trim())
     }
     
     println()
     result2.foreach(println)
     println()
     
     // Print all elements in array
     for (r <- result3)
     {
       println(r.trim())
     }
     
  }
}
