package MasterTest

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import Classes.Colours
import Traits.ValidColoursImpl
import org.junit._

@RunWith(classOf[JUnitRunner])
class ValidColoursTest extends FunSuite {
  
  test("Test ValidColoursImpl returns an arry of all colours"){
    val v = ValidColoursImpl
    val c = v.allColours 
    assert(c.isInstanceOf[Array[Colours]])
  }
  
}