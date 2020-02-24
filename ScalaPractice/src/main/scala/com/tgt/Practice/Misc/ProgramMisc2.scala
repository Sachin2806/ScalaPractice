package com.tgt.Practice.Misc

object ProgramMisc2 {
  
  def main(args: Array[String])
  {
      //studAgematch() method is invoked from the main() method by passing an integer variable as argument
      println(studAgematch(7))
      println(studAgematch(5))
      println(studAgematch(12))   
      
      //matchAge() method is invoked from the main() method by passing an integer and 
      //string as variables as arguments
      println()
      println(matchAge("eight"))
      println(matchAge("twelve"))
      println(matchAge(7))
      println(matchAge(9))
      println()
      
      val st1 = new Student(1,"Adam", 12)
      val st2 = new Student(2,"John", 9)
      val st3 = new Student(3,"Reena", 16)
      
      for(st <- List(st1, st2, st3))
      {
        st match 
        {
          case Student(1,"Adam", 12) => println("Hello Adam")
          case Student(3,"Reena", 16) => println("Hello Reena")
          case Student(id,name, age) => println("Id: " + id + " Age: " + age + " Name: " + name)
         }
        
      }
  }
  
  def studAgematch(age:Int): String = age match {
    
    case 5 => "Student Age is 5"
    case 7 => "Student Age is 7"
    case 8 => "Student Age is 8"
    case 10 => "Student Age is 10"
    case _ => "Student Age is greater than 10"
  }
  
  def matchAge(age:Any) : Any = age match {
    
    case 7 => "Age is Seven"
    case "eight" => "Age is eight"
    case y:Int => "Age is greater than Seven"
    case _ => "Age is greater than ten"
  }
  
  case class Student(id:Int, name:String, age:Int)
  
}