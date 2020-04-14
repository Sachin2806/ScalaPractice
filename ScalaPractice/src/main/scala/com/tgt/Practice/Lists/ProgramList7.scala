package com.tgt.Practice.Collections

//import scala.collection.immutable 

object ProgramList7 {
  
  def main(args: Array[String]){
    
        val j = List(1,1,4,1,3,2,1)
        val i = List(8, 2, 4, 6, 7, 4,9)
        val k = List(3, 5, 7)
        val a = "Sachin Chavan"
        
        println("Demo of Distinct 	: " + j.distinct)
        println("Demo of Drop 		: " + j.drop(2))
        
        println("Demo of dropRight 	: " + j.dropRight(3))
        println("Demo of dropWhile 	: " + j.dropWhile( x=> {x % 2 != 0}))
        println("Demo of dropWhile 	: " + i.dropWhile( x=> {x % 3 != 0}))
        
        println("Demo of equals 		: " + j.equals(i))
        println("Demo of equals 		: " + j.equals(List(1,1,4,1,3,2,1)))
        println("Demo of exists 		: " + j.exists(x => (x % 2 != 0)))
        
        println("Demo of filter 		: " + j.filter(x => (x % 2 != 0)))
        println("Demo of filter 		: " + i.filter(x => (x % 3 != 0)))
        
        println("Demo of forall  	: " + i.forall (x => (x % 3 != 0)))
        println("Demo of forall  	: " + k.forall (x => (x % 2 != 0)))
        
        println("Demo of indexOf 	: " + j.indexOf(2))
        println("Demo of indexOf 	: " + j.indexOf(1))
        
        println("Demo of init		: " + j.init)
        println("Demo of iterator	: " + j.iterator)
        println("Demo of lastIndexOf	: " + j.lastIndexOf(1))
        println("Demo of last		: " + j.last)
        println("Demo of length		: " + j.length)
        println("Demo of map		: " + i.map(l => (l *l)))
        println("Demo of max		: " + i.max)
        println("Demo of min		: " + i.min)
        println("Demo of mkString	: " + j.mkString)
        println("Demo of mkString	: " + j.mkString("-"))
        println("Demo of reverse		: " + j.reverse)
        println("Demo of sum		: " + j.sum)
        println("Demo of take		: " + j.take(3))
        println("Demo of takeRight	: " + j.takeRight(3))
        println("Demo of toBuffer	: " + j.toBuffer)
        println("Demo of toSeq		: " + j.toSeq)
        println("Demo of toSet		: " + j.toSet)
        //println("Demo of toMap			: " + j.toMap)
        println("Demo of toString	: " + j.toString)
        println("Demo of sorted		: " + j.sorted)
        println("Demo of intersect	: " + j.intersect(i))
        
        println("Demo of startsWith	: " + a.startsWith("Sachin"))     
        
  }
}
