package com.tgt.Practice.Strings

object ProgramString5 {
  
  //Example program, which makes use of printf() method −
   def main(args: Array[String]) 
  {
     //Below are list of methods that can be used directly in your Scala programs  
     val result1 = "Sachin".regionMatches(0, "Sachin", 0,4)
     val result2 = "Sachin".regionMatches(0, "sachin", 0,3)
     
     val result3 = "Sachin Chavan".startsWith("Sachin")
     val result4 = "Sachin Chavan".startsWith("sachin")
     val result5 = "Sachin Chavan".startsWith("Sachin", 5)
     val result6 = "Sachin Chavan".lastIndexOf("av")
     val result7 = "Sachin Chavan".lastIndexOf("Sa")
     val result8 = "Sachin Chavan".lastIndexOf("a")     
     val result9 = "Sachin Chavan, \t Is a Spark Scala Developer".intern()
     val result10 = "Sachin Chavan".indexOf("n")    
     val result11 = "Sachin Chavan".indexOf("an")    
     val result12 = "SachinChavachin".indexOf("chi", 4)  
     val result13 = "sachin".replace("s", "S") 
     val result14 = "sachin chavan".replaceAll("sachin", "Ambika") 
     val result15 = "Saackn chavan".replaceFirst("ack", "chi")
     
     
     println("Demo of regionMatches : "+ result1)
     println("Demo of regionMatches : "+ result2)
     
     println("Demo of startsWith : "+ result3)
     println("Demo of startsWith : "+ result4)
     println("Demo of lastIndexOf String : "+ result6)
     println("Demo of lastIndexOf String : "+ result7)
     println("Demo of lastIndexOf Char: "+ result8)
     println("Demo of intern : "+ result9)
     println("Demo of indexOf Char : "+ result10)
     println("Demo of indexOf String : "+ result11)
     println("Demo of indexOf String : "+ result12)
     println("Demo of replace : "+ result13)
     println("Demo of replaceAll : "+ result14)
     println("Demo of replaceFirst : "+ result15)


     
     
  }
}
