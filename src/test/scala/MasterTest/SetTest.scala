import Traits.AbstractSet
import Traits.ColourSet

import org.junit._
import org.junit.runner._
import org.scalatest.junit._
import org.scalatest._
import Assert._

class SetTest {

  val size = 4
  
  @Before
  def setUp: Unit = {
  }

  @After
  def tearDown: Unit = {
  }

  @Test
  def createColourSet = {
    
    val cols = new ColourSet("ABCD")
    assert(cols.isInstanceOf[AbstractSet])
    
  }

}