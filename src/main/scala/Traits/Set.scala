package Traits

import Classes.BlackPeg
import Classes.Colours
import Classes.Pegs
import Classes.WhitePeg

/**
 * An abstract set.
 */
trait AbstractSet {}

/**
 * A set holding an array of colours.
 */
class ColourSet(s: String) extends AbstractSet {

  val colours: Array[Colours] = {
    val array = new Array[Colours](s.length)
    for(i <- 0 to array.length - 1){
      array(i) = ValidColoursImpl.getColours(s.charAt(i))
    }
    array
  }
  
  override def toString = {
    colours.toString
  }
  
}

/**
 * A set holding an array of pegs.
 */
class PegSet(secret: SecretCode, guess: Guesses) extends AbstractSet {
  
  val pegs: Array[Pegs] = {
    
    val length = secret.toString.length
    val pSet = new Array[Pegs](length)
    
    for(i <- 0 to length - 1){
      if(secret.getCode.colours(i) == guess.getGuess.colours(i)){
        pSet(i) = new WhitePeg
      } else {
        pSet(i) = new BlackPeg
      }
    }
    pSet
  }
  
}