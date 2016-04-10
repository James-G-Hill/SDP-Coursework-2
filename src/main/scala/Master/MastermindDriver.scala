package Master

object MastermindDriver {
  
  val errorMessage = "That is not a valid command."
  val easy = "E"
  
  def main(args: Array[String]) {
    
    if(!args.isEmpty && args(0).equals(easy)){

      // Run easy game 
      val g = Factory.getInstance(classOf[NewGame], b = true)
      g.asInstanceOf[Game].runGames
      
    } else if (args.isEmpty) {
      
      // Run hard game
      val g = Factory.getInstance(classOf[NewGame], b = false)
      g.asInstanceOf[Game].runGames
      
    } else {
      
      // Show an error message
      println(errorMessage)
      
    }
  }
}