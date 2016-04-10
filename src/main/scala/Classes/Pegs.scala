package Classes

abstract trait Pegs {

  val colour: String

}

final case class BlackPeg(colour: String = "Black") extends Pegs

final case class WhitePeg(colour: String = "White") extends Pegs