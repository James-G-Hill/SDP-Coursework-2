package Master

import Traits.BoardImpl
import Traits.ValidColours

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

  val allColours: ValidColours

  def this(easy: Boolean) {

    this()
    showCode = easy

  }

}

class NewGame(showCode: Boolean) extends GameAbstractImpl {
  
  var codeSize: Int = 1

  def runGames = {
    startUp
  }

  def startUp = {
    
    val board = Factory.getInstanceBoard(classOf[BoardImpl])

  }

}