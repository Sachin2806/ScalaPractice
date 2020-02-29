package com.tgt.Practice.Final

import scala.util.matching.Regex
import java.io.IOException
import java.io.FileNotFoundException
import java.io.FileReader

object ProgExcpHndl2
{
  
  def main(args: Array[String])
  {
    try {
         
         val f = new FileReader("input.txt")
         //val f = new FileReader("C:/Users/CSC/workspace/ScalaDemo/Files/wc.txt")
        } catch 
        {
           case ex: FileNotFoundException => 
             {
                println("Missing file exception")
             }
         
           case ex: IOException => 
             {
                println("IO Exception")
             }
        } finally 
        {
         println("Exiting finally...")
        }
   }
}