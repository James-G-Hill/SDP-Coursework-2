package Classes

sealed trait Pegs {

  def apply(colour:String) = colour match{
    case "Black"  => BlackPeg
    case "White" => WhitePeg
  }

}



final case class BlackPeg(colour: String = "Black") extends Pegs

final case class WhitePeg(colour: String = "White") extends Pegs