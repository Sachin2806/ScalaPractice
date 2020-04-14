package com.tgt.Practice.Lists

object ProgramList4 {
  
  def main(args: Array[String]){
    
      //You can use List.fill() method creates a list consisting of zero or more copies of the same element. 
      //Try the following example program.
       
      val fruit = List.fill(5)("Apples")
      val num = List.fill(10)(2)
      val fruit1 = List("apples", "oranges", "pears")
      val names = List("John","Koby", "Josh", "Matilda", "Zac", "Mary Poppins")
      
      val list1 = List(1,2,3,4,5,6,7,8,9,10)
      val list2 = List(11,22,33,44,55,66,77,88,99,110)
      val list3 = List(5,6,8)
      val list4 = List(6, 2, 3,5,4,8)
      
      //Tabulating a function
      val xs1 = List.tabulate(5)(_ + 1)
      val xs2 = List.tabulate(5)(_ + 2)
      val xs3 = List.tabulate(3, 6) (_ * _)
           
      println( "fruit : " + fruit )
      println( "num : " + num )
      println( "xs1 : " + xs1 )
      println( "xs2 : " + xs2 )
      println( "xs3 : " + xs3 )
      println("Reversing List : " + fruit1.reverse)
      
      println("\nDemo of fold        : " + list1.fold(0){(a,b) => (a+b)})
      println("Demo of foldLeft    : " + list1.foldLeft(0){(a,b) => (a+b)})
      println("Demo of foldRight   : " + list1.foldRight(0){(a,b) => (a+b)})
      
      println("\nDemo of reduce      : " + list2.reduce({(a,b) => a + b} ))
      println("Demo of reduceLeft  : " + list2.reduceLeft{(a,b) => (a+b)})
      println("Demo of reduceRight : " + list2.reduceRight{(a,b) => (a+b)})
      
      println("\nDemo of scan        : " + list4.scan(0)({(a,b) => a + b} ))
      println("Demo of scanLeft    : " + list4.scanLeft(0){(a,b) => (a+b)})
      println("Demo of scanRight   : " + list4.scanRight(0){(a,b) => (a+b)})
      
      println("\nDemo of product   : " + list3.product)
      
      val longestName = names.reduce(findLongest(_,_))
      println("\nDemo of reduce through function : " + longestName)
      
      val lastName = names.reduce(lastAlphabetically(_,_))
      println("\nDemo of reduce through function : " + lastName)
  } 
  
  def findLongest(nameA:String, nameB:String):String = 
  {
    if (nameA.length < nameB.length) nameB else nameA
  }
  
  def lastAlphabetically(nameA:String, nameB:String):String = 
  {
    if (nameA < nameB) nameB else nameA
  }
}
