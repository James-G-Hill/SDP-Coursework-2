import Master.Factory
import Master.Game
import Master.NewGame
import Traits.Board
import Traits.BoardImpl
import org.junit._
import org.junit.runner._
import org.scalatest.junit._
import org.scalatest._
import Assert._

class FactoryTest {

  @Before
  def setUp: Unit = {}

  @After
  def tearDown: Unit = {}

  @Test
  def getInstanceEasy = {

    val g = Factory.getInstance(classOf[NewGame], true)
    assert(g.isInstanceOf[Game])

  }

  @Test
  def getInstanceHard = {

    val g = Factory.getInstance(classOf[NewGame], false)
    assert(g.isInstanceOf[Game])

  }

  @Test
  def getNewBoard = {

    val b = Factory.getInstanceBoard(classOf[BoardImpl])
    assert(b.isInstanceOf[Board])

  }

}