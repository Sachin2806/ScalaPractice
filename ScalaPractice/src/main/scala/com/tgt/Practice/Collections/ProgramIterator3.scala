package com.tgt.Practice.Collections

object ProgramIterator3 {
  
  def main(args: Array[String]){
    
    val itb1=Iterator(3,2,4,9,7)
    val itb11=Iterator(5, 10, 14)
    val itb12=Iterator(5, 10, 14)
    val itb13=Iterator(3,2,4,9,7)
    val itb14=Iterator(3,2,4,9,7)
   
    val ita=Iterator(3,2,4,9,7)
    val ita2=Iterator(3,2,4,9,7)
    val ita4=Iterator(3,2,4,9,7)
    val ita5=Iterator(3,2,4,9,7)
    
    val itb2=itb1.filter(x =>(x%3 == 0))
    val itb3=itb1.filterNot(x =>(x%3 == 0))
    val itb4=itb1.find(x =>(x%3 == 0))
    val itb5=itb1.find(x =>(x%5 == 0))
    val itb6=itb11.forall(x =>(x%5 == 0))
    val itb7=itb11.forall(x =>(x%5 != 0))
    val itb8 = Iterator().hasDefiniteSize
    val itb9 = itb12.hasDefiniteSize
    val itb10 = itb13.indexOf(2)
    val itb15 = itb14.indexWhere(x=>(x%7==0))
    
    val ita1 = ita.isTraversableAgain
    val ita3 = ita2.map(x =>(x * x))
      
    //Filters out elements that satisfy the condition until end of iteration and then it fails.
    println("Demo of filter in Iterators 			: " + itb2)
    
    //Filters out elements that do not satisfy the condition until end of iteration and then it fails.
    println("Demo of filterNot in Iterators 			: " + itb3)
    
    //This returns the first value, if any, that satisfies the predicate.
    println("Demo of find in Iterators 			: " + itb4)
    println("Demo of find in Iterators 			: " + itb5)
    
    println("Demo of forall in Iterators 			: " + itb6)
    println("Demo of forall in Iterators 			: " + itb7)
    
    println("Demo of hasDefiniteSize in Iterators 		: " + itb8)
    println("Demo of hasDefiniteSize in Iterators 		: " + itb9)
    
    println("Demo of indexOf in Iterators 			: " + itb10)
    println("Demo of indexWhere in Iterators 		: " + itb15)
    
    println("Demo of isTraversableAgain in Iterators 	: " + ita.isTraversableAgain)
    println("Demo of isTraversableAgain in Iterators 	: " + ita3.next())
    
    println("Demo of mkString				: " + ita4.mkString(","))
    println("Demo of product					: " + ita5.product)
    
  }
}