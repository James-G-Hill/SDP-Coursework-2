package Traits

trait Guesses {
  
  val guess: ColourSet
  
  def getGuess(): ColourSet
  
}

class GuessesImpl(s: String) extends Guesses {

  val guess = {
    new ColourSet(s)
  }
  
  override def getGuess(): ColourSet = guess

}