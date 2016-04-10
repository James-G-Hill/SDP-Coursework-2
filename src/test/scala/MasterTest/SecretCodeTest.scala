package MasterTest

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import Traits.ColourSet
import Traits.SecretCode
import Traits.SecretCodeImpl
import org.junit._
import Assert._

@RunWith(classOf[JUnitRunner])
class SecretCodeTest extends FunSuite {
  
  val sc = new SecretCodeImpl(4)
  
  test("SecretCodeImpl is of type SecretCode"){
    assert(sc.isInstanceOf[SecretCode])
  }
  
  test("Test the getCode method returns a ColourSet"){
    val cs = sc.getCode
    assert(cs.isInstanceOf[ColourSet])
  }
  
}