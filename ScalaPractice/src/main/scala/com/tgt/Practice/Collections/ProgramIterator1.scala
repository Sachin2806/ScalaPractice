package com.tgt.Practice.Collections

object ProgramIterator1 {
  
  def main(args: Array[String]){
    
    val it = Iterator("a", "number", "of", "words")
    val iter = Iterator(11, 12, 13, 14) 
    val ita = Iterator(20,40,2,50,69,90)
    val itb = Iterator(20,40,2,50,69,90)
    val ite = Iterator()
    
    val ita1 = Iterator(20,40,2,50,69, 90)
    val itb1 = Iterator(20,40,2,50,69, 90)
    val itb2 = Iterator(20,40,2,50,69, 90)
    val itb3 = Iterator(20,40,2,50,69, 90)
    val itb4 = itb3.drop(2)
    val itb5 = itb2.dropWhile(x=> (x > 10))
    val itb6 = Iterator(20,40,2,50,69, 90)
    
    val result = iter.addString(new StringBuilder(), "#")
    
    while(it.hasNext)
    {
      println(it.next())
    }
   
    println("Demo of max in Iterators 	: " + ita.max)
    println("Demo of min in Iterators 	: " + itb.min)
    println("Demo of size in Iterators 	: " + ita1.size)
    println("Demo of length in Iterators 	: " + itb1.length)
    println("Demo of addString in Iterators	: " + result)
    
    println("Demo of nonEmpty in Iterators	: " + itb2.nonEmpty)
    println("Demo of nonEmpty in Iterators	: " + ite.nonEmpty)
    
    println("Demo of isEmpty in Iterators 	: " + itb2.isEmpty)
    println("Demo of isEmpty in Iterators 	: " + ite.isEmpty)
    
    println("Demo of buffered in Iterators 	: " + iter.buffered)
    
    println("Demo of contains in Iterators 	: " + itb2.contains(20))
    println("Demo of contains in Iterators 	: " + itb2.contains(30))
    
    println("Demo of count in Iterators 	: " + itb3.count(x => (x%5 != 0)))
    
    println("Demo of Drop in Iterators 	: " + itb4)
    println("Demo of Drop in Iterators 	: " + itb4.next())
    
    println("Demo of dropWhile in Iterators 	: " + itb5)
    println("Demo of duplicate in Iterators 	: " + itb5.duplicate)
    
    println("Demo of exists in Iterators 	: " + itb6.exists(x => (x%5 != 0)))
    println("Demo of exists in Iterators 	: " + itb6.exists(x => (x%11 == 0)))
    
    
    
  }
}