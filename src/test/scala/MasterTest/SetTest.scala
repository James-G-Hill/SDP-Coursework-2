import org.junit._
import org.junit.runner._
import org.scalatest.junit._
import org.scalatest._
import org.scalatest.FunSuite
import Assert._

class SetTest extends FunSuite {

  val size = 4
  
  test("A new ColourSet should be an instance of AbstractSet"){
    val cols = new ColourSet("ABCD")
    assert(cols.isInstanceOf[AbstractSet])
  }
  
}