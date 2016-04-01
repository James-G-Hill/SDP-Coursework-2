import Master.NewGame
import org.junit._
import Assert._

class FactoryTest {

  @Before
  def setUp: Unit = {}

  @After
  def tearDown: Unit = {}

  @Test
  def getInstanceEasy = {
    
    val g = Factory.getInstance(classOf[NewGame], true)
    
  }

}