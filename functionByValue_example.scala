object functionByValue {
  def main(arg:  Array[String]){
    
    def time()  :  Long = {
      println("Time Function called...")
      return System.nanoTime()
    }
    
    def exec(t:  Long)  :  Long = {
      println("Exec Function called...")
      println("System Time in nano seconds called..." + t)
      println("Exiting Exec Function...")
      return t     
    }
    
    println("Main Function called..." + exec(time()))
  }
}