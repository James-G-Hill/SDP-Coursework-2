package main.scala.Classes

abstract class Pegs {

  val colour:String

}

case class blackPeg(colour: String = "black") extends Pegs

case class whitePeg(colour: String = "white") extends Pegs



