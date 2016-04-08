package Master

import Traits.Board
import Traits.BoardImpl

object Factory {

  def getInstance(c: Class[_], b: Boolean): Game = {
    new NewGame(b)
  }

  def getInstanceBoard(c: Class[_]): Board = {
    new BoardImpl
  }

}