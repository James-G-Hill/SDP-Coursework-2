package main.scala.Traits
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
