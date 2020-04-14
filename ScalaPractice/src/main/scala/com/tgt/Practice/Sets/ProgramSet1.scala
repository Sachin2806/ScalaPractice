package com.tgt.Practice.Sets

object ProgramSet1 {
  
  def main(args: Array[String]){
    
    //Sets defined for various data types
    val fruit = List("apples", "oranges", "pears")
    val nums: Set[Int] = Set()
    
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")
    
    val num = Set(5,6,9,20,30,45)
    
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)
      
    //returns head of the list
    println("Head in Sets 			: " + fruit.head)
    
    //returns a list consisting of all elements except the first
    println("Tail in Sets 			: " + fruit.tail)
    
    //returns true if the list is empty otherwise false.
    println("isEmpty in Sets 		: " + fruit.isEmpty)
    println("isEmpty in Sets 		: " + nums.isEmpty)
    
    // use two or more sets with ++ as operator
    var fruit3 = fruit1 ++ fruit2
    println( "fruit1 ++ fruit2 		: " + fruit3 )
    
    // use two sets with ++ as method
    var fruit4 = fruit1.++(fruit2)
    println( "fruit1 .++ fruit2 		: " + fruit4 )
    
    println( "Max element in a set		: " + num.max )
    println( "Min element in a set		: " + num.min )
    
    println( "Demo of .& in a set		: " + num1.&(num2))
    println( "Demo of Intersect in a set	: " + num1.intersect(num2))
    
  }
  
}