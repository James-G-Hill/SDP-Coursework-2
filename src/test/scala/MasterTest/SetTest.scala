import Traits.AbstractSet
import Traits.ColourSet
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class SetTest extends FunSuite {

  val size = 4
  
  test("A new ColourSet should be an instance of AbstractSet"){
    val cols = new ColourSet("ABCD")
    assert(cols.isInstanceOf[AbstractSet])
  }
  
}