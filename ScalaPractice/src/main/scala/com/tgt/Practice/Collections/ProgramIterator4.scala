package com.tgt.Practice.Collections

object ProgramIterator4 {
  
  def main(args: Array[String]){
    
    val t1 = Iterator(4,2, 5, 6)
    val t2 = Iterator(4,2, 5, 6)
    val t3 = Iterator(1, 3, 4,2, 5, 6)
    val t4 = Iterator(3,2,4,9,7).toSeq
    val t5 = Iterator(3,2,4,9,7).slice(1,4)
    val t6 = Iterator(3,2,4,9,7).sum
    val t7 = Iterator(3,2,4,9,7).take(3)
    val t8 = Iterator(3,2,4,9,7).seq
      
    //If both iterators produce the same elements in the same order, this returns true; otherwise, false.
    println("Demo of sameElements in Iterators 			: " + t1.sameElements(t2))
    println("Demo of sameElements in Iterators 			: " + t1.sameElements(t3))
    println("Demo of sum in Iterators 				: " + t6)
    println("Demo of sum in Iterators 				: " + t7)
   
    //This returns a sequential view of the iterator in Scala.
    println("Demo of toSeq in Iterators 				: ")
    for(i <- t4.toSeq) { println(i) }
    
    println("Demo of seq in Iterators 				: ")
    for(i <- t8.seq) { println(i) }
    
    println("Demo of take in Iterators 				: ")
    for(i <- t7.toSeq) { println(i) }
    
    println("Demo of slice in Iterators 				: ")
    while(t5.hasNext)
    {
      println(t5.next())
    }

  }
}