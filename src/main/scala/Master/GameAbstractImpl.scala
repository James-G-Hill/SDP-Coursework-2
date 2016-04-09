package Master

import Traits.{BoardImpl, ColourSet, SecretCode, SecretCodeImpl, ValidColours, ValidColoursImpl}

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
  var codeSize: Int

  val gameColours: ValidColours

  def this(easy: Boolean) {
    this()
    showCode = easy
  }

}

class NewGame(showCode: Boolean) extends GameAbstractImpl {
  
  override val gameColours: ValidColours = ValidColoursImpl

  var turn = 1
  var codeSize: Int = 1
  var finished: Boolean = false
  
  val board = Factory.getInstanceBoard(classOf[BoardImpl])
  //colour genesis
  val secretCode: SecretCode = {new SecretCodeImpl(codeSize)}
  
  def runGames = {
    
    val printer = new GamePrinter(codeSize, gameColours)
    
    print(printer.welcome)
    if(showCode) print(printer.secretPrint(secretCode.toString))
    print(printer.guessPrint(board.size - turn))
    
    // Play turns of the game.
    while(!finished) {
      
      val guessInput = printer.getGuess
      val guess = new ColourSet(guessInput)
      board.addRow(guess)
      
      print(printer.printBoard(board, turn))
      
      // Check win or lose.
      if(guess == secretCode) {
        
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