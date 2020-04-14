package com.tgt.Practice.Collections

object ProgramList2 {
  
  def main(args: Array[String]){
    
      //You can use either ::: operator or List.:::() method or List.concat() method to add two or more lists. 
      //Please find the following example given below 
    
      //val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
      //val fruit2 = "mangoes" :: ("banana" :: Nil)
      
      val fruit1 = List("apples", "oranges", "pears")
      val fruit2 = List("mangoes", "banana")

      // use two or more lists with ::: operator
      var fruit = fruit1 ::: fruit2
      println( "fruit1 ::: fruit2           : " + fruit )
      
      // use two lists with Set.:::() method
      fruit = fruit1.:::(fruit2)
      println( "fruit1.:::(fruit2)          : " + fruit )

      // pass two or more lists as arguments
      fruit = List.concat(fruit1, fruit2)
      println( "List.concat(fruit1, fruit2) : " + fruit  )
   }
}
