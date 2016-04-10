package Traits

trait Guesses {
  
  val guess: ColourSet
  
  def getGuess(): ColourSet
  
  def correctGuess(secret: SecretCode): Boolean
  
}

class GuessesImpl(s: String) extends Guesses {

  val guess = {
    new ColourSet(s)
  }
  
  override def getGuess(): ColourSet = guess

  override def correctGuess(secret: SecretCode): Boolean = {
    var correct = true
    for(i <- 0 to s.length - 1){
      if(guess.colours(i) != secret.getCode.colours(i)){
        correct = false
      }
    }
    correct
  }
  
}