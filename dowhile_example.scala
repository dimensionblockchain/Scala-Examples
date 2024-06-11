object dowhile_example {
  def main(arg: Array[String]){
    
    var a = 1
    
    do{
      println(a)
      a = a + 2
    }while(a <= 100)
  }
}