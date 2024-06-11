object function_example {
  def main(arg: Array[String]){
    
    def add(a : Double = 100, b : Double = 200) : Double = {
      var sum = a + b
      return sum
    }
    
    println("The sum of a and b is: " + add(a = 1278.0989767, b = 899786.746465))
  }
}