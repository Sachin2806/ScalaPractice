package com.tgt.Practice.Strings

object ProgramString4 {
  
  //Example program, which makes use of printf() method −
   def main(args: Array[String]) 
  {
      val name = "Sachin Chavan"
      val initialName = "Shri "
      val trimName = "  Ambika Nasalapure  "
      val firstName = "Sachin"
     
      
     //Below are list of methods that can be used directly in your Scala programs 
     println("Demo of charAt : "+ name.charAt(1))
     println("Demo of compareTo : " + name.compareTo("5"))
     println("Demo of compareTo : " + name.compareTo("Ambika"))
     
     println("Demo of contentEquals : " + name.contentEquals("Sachin"))
     println("Demo of contentEquals : " + name.contentEquals("Sachin Chavan"))
     
     println("Demo of compareToIgnoreCase : " + firstName.compareToIgnoreCase("sachin"))
     println("Demo of compareToIgnoreCase : " + firstName.compareToIgnoreCase("Sachi"))
     println("Demo of compareToIgnoreCase : " + firstName.compareToIgnoreCase("Sach"))
     println("Demo of compareToIgnoreCase : " + firstName.compareToIgnoreCase("Sac"))
    
     println("Demo of endsWith : " + firstName.endsWith("i"))
     println("Demo of endsWith : " + firstName.endsWith("n"))
     
     println("Demo of equals : " + firstName.equals("sachin"))
     println("Demo of equals : " + firstName.equals("Sachin"))
     println("Demo of equalsIgnoreCase : " + firstName.equalsIgnoreCase("Sachin"))
     println("Demo of equalsIgnoreCase : " + firstName.equalsIgnoreCase("sachi"))
     
     println("Demo of getBytes : " + name.getBytes)
     println("Demo of hashCode : " + firstName.hashCode())
         
     println("Demo of concat : " + initialName.+(name))
     println("Demo of concat : " + initialName.concat(name))
     
     println("Demo of length : " + name.length())
     
     println("Demo of toLowerCase : " + name.toLowerCase())
     println("Demo of toUpperCase : " + name.toUpperCase())
     
     println("Demo of trim : " + trimName.trim())
     
  }
}
