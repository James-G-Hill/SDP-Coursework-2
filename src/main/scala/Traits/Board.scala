package Traits
/**
@return board: the game board
  **/
trait Board {

  val size = 12

  def ballArray : Array[String]

  def pegArray : Array[String]

  def getBoard()

  def addRow()

}

class BoardImpl extends Board {

  def colourArray: Array[Guesses] = {new Array[Guesses](1)}

  def pegArray: Array[PegSet] = {new Array[PegSet](1)}

  def getBoard() = {}

  def addRow() = {}

}