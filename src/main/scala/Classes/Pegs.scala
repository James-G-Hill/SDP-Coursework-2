package Classes

abstract sealed class Pegs {

  val colour:String

}

case class BlackPeg(colour: String = "Black") extends Pegs

case class WhitePeg(colour: String = "White") extends Pegs