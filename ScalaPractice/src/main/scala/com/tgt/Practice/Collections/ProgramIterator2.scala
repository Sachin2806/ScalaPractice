package com.tgt.Practice.Collections

object ProgramIterator2 {
  
  def main(args: Array[String]){
    
    val result = Iterator(1,3).++(Iterator(2,4))
    val it1 = Iterator(3,2,4,9,7)
    val it2 = Iterator(3,2,4,9,7)
    val it3 = Iterator(3,2,4,9,7)
    val it4 = Iterator(3,2,4,9,7)
    val it5 = Iterator(3,2,4,9,7)
    val it6 = Iterator(3,2,4,9,7)
    val it7 = Iterator(0,0,0,0,0,0,0,0,0,0)
   
    val it = Iterator(4, 8, 3, 7)
    val arr = new Array[Int](7)
    
    it.copyToArray(arr, 1)
    println("Demo of copyToArray : " + arr.mkString(","))
    println("Demo of toArray : " + it1.toArray.mkString(","))
    println("Demo of toBuffer : " + it2.toBuffer)
    println("Demo of toList : " + it5.toList)
    println("Demo of toString : " + it6.toString)
    println("Demo of zip : " + it7.zip(it1))
    println("Demo of toIterable : " + it3.toIterable)
    println("Demo of toIterator : " + it4.toIterator)
    
    while(it4.hasNext)
    {
      println(it4.next())
    }
    println()
    
    while(result.hasNext)
    {
      print(result.next())
    }
    
    
    
  }
}