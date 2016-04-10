package Master

import Traits.{BoardImpl, ColourSet, SecretCode, SecretCodeImpl, ValidColours, ValidColoursImpl, GuessesImpl, Guesses, PegSet}

abstract class GameAbstractImpl extends Game {

  private var showCode: Boolean = false

  /**
    * Create a Game object.
    *
    * @param easy If easy is true the secret code will be
    *             revealed at all times when playing the game. If easy is
    *             false the secret code is not revealed until correctly guessed
    *             or the player runs out of turns.
    *
    */
  var codeSize: Int = Factory.getBeanFactory.getBean("codeSize").asInstanceOf[Int]

  val gameColours: ValidColours

  def this(easy: Boolean) {
    this()
    showCode = easy
  }

}

class NewGame(showCode: Boolean) extends GameAbstractImpl {
  
  override val gameColours: ValidColours = ValidColoursImpl

  val factory = Factory.getBeanFactory
  
  var turn = 0
  var finished: Boolean = false
  
  val board = Factory.getInstanceBoard(classOf[BoardImpl])
  val secretCode: SecretCode = {new SecretCodeImpl(codeSize)}
  
  def runGames = {
    
    val printer = new GamePrinter(codeSize, gameColours)
    
    print(printer.welcome)
    if(showCode) print(printer.secretPrint(secretCode.toString))
    print(printer.guessPrint(board.size - turn))
    
    // Play turns of the game.
    while(!finished) {
      
      print(printer.getGuess)
      val guessInput: String = Input.getGuess
      val guess: Guesses = new GuessesImpl(guessInput)
      board.addRow(guess, new PegSet(codeSize, secretCode, guess))
      
      print(printer.printBoard(board, turn))
      
      // Check win or lose.
      if(guess.getGuess == secretCode.getCode) {
        
        finished = true
        print(printer.winner)
        
      } else {
        
        print(printer.wrong(board, turn))
        turn = turn + 1
        
        if(turn > board.size) {
          finished = true
          print(printer.loser)
        }
        
      }
    }
  }  
}