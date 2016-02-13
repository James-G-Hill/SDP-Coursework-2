object MastermindDriver {
  
  val errorMessage = "That is not a valid command."
  val easy = "E"
  
  def main(args: Array[String]) {
    
    if(args(1).equals(easy)){
      
      // Run easy game 
      var g: Game = Factory.getInstance(classOf[Game], true)
      g.runGames
      
    } else if (args.isEmpty) {
      
      // Run hard game
      var g: Game = Factory.getInstance(classOf[Game], false)
      g.runGames
      
    } else {
      
      // Show an error message
      println(errorMessage)
      
    }
    
  }
  
}