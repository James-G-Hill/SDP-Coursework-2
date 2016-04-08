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
    new Array(s.length)
    // create array from string here
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