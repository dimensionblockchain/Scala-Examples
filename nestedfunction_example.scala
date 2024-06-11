object nestedfunction_example {
  def main(arg: Array[String]){
    
    def square(x:  Double)  :  Double = {
      return x*x
    }
    
    def sumsqrz(x:  Double,  y:  Double) :  Double = {
      return square(x) + square(y)
    }
       
    println("The sum of the squares is: " + sumsqrz(45,394))
  }
}