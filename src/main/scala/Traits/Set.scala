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
    var s: String = ""
    for(i <- 0 to colours.length - 1){
      s = s + colours(i).toString + " "
    }
    s
  }
  
}

/**
 * A set holding an array of pegs.
 */
class PegSet(codeSize: Int, secret: SecretCode, guess: Guesses) extends AbstractSet {
  
  val pegs: Array[Pegs] = {
    
    val pSet = new Array[Pegs](codeSize)
    
    var correct = 0
    
    for(i <- 0 to codeSize - 1){
      if(secret.getCode.colours(i) == guess.getGuess.colours(i)){
        correct = correct + 1
      }
    }
    
    for(i <- 0 to codeSize - 1){
      if(i < correct){
        pSet(i) = new WhitePeg
      } else {
        pSet(i) = new BlackPeg
      }
    }
    pSet
  }
  
  override def toString: String = {
    var s: String = ""
    for(i <- 0 to pegs.length - 1){
      s = s + pegs(i).colour + " "
    }
    s
  }
  
}