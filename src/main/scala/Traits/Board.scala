package Traits

/**
  @return board: the game board
**/
trait Board {

  val size = 12
  
  def addRow(cs: ColourSet)
  def getBoard()
  def colourArray : Array[Guesses]
  def pegArray : Array[PegSet]
  
}

class BoardImpl extends Board {
  
  def addRow(cs: ColourSet) = {
    
  }
  
  def getBoard() = {}
  
  def colourArray: Array[Guesses] = {new Array[Guesses](1)}
  
  def pegArray: Array[PegSet] = {new Array[PegSet](1)}
  
}