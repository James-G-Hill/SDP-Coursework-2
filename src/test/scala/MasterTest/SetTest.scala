import Traits.AbstractSet
import Traits.ColourSet

import org.scalatest.junit._
import org.scalatest._
import org.scalatest.FunSuite

class SetTest extends FunSuite {

  val size = 4
  
  test("A new ColourSet should be an instance of AbstractSet"){
    val cols = new ColourSet("ABCD")
    assert(cols.isInstanceOf[AbstractSet])
  }
  
}