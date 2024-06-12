object functionByName {
  def main(arg: Array[String]){
    
    def time()  :  Long = {
      println("Time Function Called")
      return System.nanoTime()
    }
    
    def exec(t  : => Long)  : Long = {
      println( "Exec Function Called" )
      println( "Time in nano seconds: " +t )
      println( "Exiting from Exec Function" )
      return t
    }
    
    println( "Main Function Called: " + exec(time()) )
  }
}