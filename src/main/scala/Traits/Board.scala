package Traits

/**
  @return board: the game board
**/
import Classes.Pegs

trait Board {

  var currentRow = 0
  
  val size = 12
  
  def addRow(guess: Guesses, p: PegSet)
  def getBoard()
  val colourArray : Array[Guesses]
  val pegArray : Array[PegSet]
  
}

class BoardImpl extends Board {
  
  override val colourArray: Array[Guesses] = {new Array[Guesses](12)}
  override val pegArray: Array[PegSet] = {new Array[PegSet](12)}
  
  override def addRow(guess: Guesses, p: PegSet) = {
    colourArray(currentRow) = guess
    pegArray(currentRow) = p
    currentRow = currentRow + 1
  }
  
  override def getBoard() = {}
  
}