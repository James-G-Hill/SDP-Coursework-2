package Traits

/**
@return board: the game board
  **/
trait Board {

  val size = 12

  def colourArray : Array[Guesses]

  def pegArray : Array[PegSet]

  def getBoard()

  def addRow()

  var turn = 0

}

class BoardImpl extends Board {

  def colourArray: Array[Guesses] = {new Array[Guesses](1)}

  def pegArray: Array[PegSet] = {new Array[PegSet](1)}

  def getBoard() = {}

  def addRow() = {
    turn = turn+1
  }

}