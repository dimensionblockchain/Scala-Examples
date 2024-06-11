

object factorialwhile_example {
  def main(arg: Array[String]){
    
    var fact_result = 1
    var num = 5
    
    while(num > 0){
      fact_result = fact_result * num
      num = num -1
    }
    
    println(fact_result)
  }
}