package com.tgt.Practice.Misc

object ProgramMisc1 {
  
  def main(args: Array[String])
  {
      // calling test1 and test2 methods
      println("In method test1 : " + test1(1))
      println("In method test2 : " + test2("Geeks"))
  }
  
  def test1(x:Int): String = x  match {
      // if value of x is 0,this case will be executed 
      case 0 => "Hello, Geeks!!"
        
      // if value of x is 1,this case will be executed 
      case 1 => "Are you new to Scala Learning"
        
      // if x doesnt match any sequence, then this case will be executed 
      case _ => "Good Luck"
  }
  
  def test2(x:String): String = x match {
    case "G1" => "GFG"
    case "G2" => "Scala Tutorials"
    case _    => "Default Case Executed"
  }
}