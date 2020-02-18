package com.tgt.Practice.Strings

object ProgramString7 {
  
  //Example program, which makes use of printf() method −
   def main(args: Array[String]) 
  {
     val result1 = "Sachin".matches("Sachin")
     val result2 = "Sachin Chavan".matches("Sachin")
     val result3 = "Sachin Chavan".toCharArray()
     val m1 = Map(3 -> "geeks", 4 -> "for", 4 -> "for")
     val result4 = m1.toString()
     
     val result5 = "Sachin Chavan".substring(6)
     val result6 = "Sachin Chavan".substring(0, 6)
     
     val result7 = "GeeksforGeeks".subSequence(5, 8)
          
     println("Demo of matches : "+ result1)
     println("Demo of matches : "+ result2)
     println("Demo of toString : "+ result4)
     println("Demo of substring : "+ result5)
     println("Demo of substring : "+ result6)
     println("Demo of subSequence : "+ result7)
     
     println("Demo of toCharArray : ")
     for (i <- result3)
     {
       
       println(i.toUpper)
     }
     
     
  }

}


   