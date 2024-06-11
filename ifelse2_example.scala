

object ifelse2_example {
  def main(arg: Array[String]){
    
    var grades = 35
    if(grades >= 85)
    {
      println("Honors")
    } else if (grades >= 75 && grades < 85)
      println("Average")
      else if (grades >= 65 && grades < 75)
        println("Below Average")
      else if (grades >= 55 && grades < 65)
        println("Disciplinary Action")
       
       else println("FAIL")
  }
}