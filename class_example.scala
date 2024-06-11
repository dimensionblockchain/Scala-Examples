object class_example {
  def main(arg: Array[String]){
    
    var ob1 = new NewClass("Hello Scala!")
    ob1.sayHi()
    
    var ob2 = new NewClass("Hello Pure Object Oriented Programming!")
    ob2.sayHi()
    
    var ob3 = new NewClass("Hello Functional Programming!")
    ob3.sayHi()
  }
}

class NewClass(mssg: String){
  def sayHi() = println(mssg)
}