object nestedfunction_example {
  def  main(arg: Array[String]){
    
    def square(x: Double) : Double = {
      return x*x
    }
    
    def sumsquare(x: Double, y: Double) : Double = {
      return square(x) + square(y)
    }
    
    println("The sum of squares is: " + sumsquare(45,90))
  }
}