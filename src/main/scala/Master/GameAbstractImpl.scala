package Master

import Traits.BoardImpl
import Traits.SecretCode
import Traits.SecretCodeImpl
import Traits.ValidColours
import Traits.ValidColoursImpl

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

  var codeSize: Int = 1
  val board = Factory.getInstanceBoard(classOf[BoardImpl])
  val secretCode: SecretCode = {new SecretCodeImpl(codeSize)}
  def runGames = {}

}