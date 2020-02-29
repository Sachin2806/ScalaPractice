package com.tgt.Practice.Final

import scala.util.matching.Regex
import java.io.IOException

object ProgExcpHndl1 
{
  
  def main(args: Array[String])
  {
    
    try
    {
      var N = 1/0      
    }
    catch
    { 
            // Catch block contain cases.  
            case i: IOException => 
            { 
                println("IOException occurred.") 
            } 
            case a : ArithmeticException => 
            { 
                println("Arithmetic Exception occurred.") 
            } 
     }
    try
        { 
            var N = 5/0
        }  
        catch
        { 
            // Catch block contain case. 
            case ex: ArithmeticException => 
            { 
                println("Arithmetic Exception occurred.") 
            } 
        } 
        finally
        { 
            // Finally block will execute  
            println("This is final block.") 
        } 
    
    
    
  }
}