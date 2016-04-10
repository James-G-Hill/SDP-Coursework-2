package Traits

import Classes.Colours
import Classes.Pegs

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
  
}

/**
 * A set holding an array of pegs.
 */
class PegSet(size: Int, secret: SecretCode, cs: ColourSet) extends AbstractSet {
  
  val pegs: Array[Pegs] = {
    new Array(size)
  }
  
}