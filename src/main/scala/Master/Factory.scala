package Master

import Traits.Board
import Traits.BoardImpl
import org.springframework.beans.factory.BeanFactory
import org.springframework.context.support.ClassPathXmlApplicationContext

object Factory {

  def getInstance(c: Class[_], b: Boolean) = {
    new NewGame(b)
    //val cons = c.getConstructor(b.getClass)
    //cons.setAccessible(true)
    //cons.newInstance(b)
  }

  def getInstanceBoard(c: Class[_]): Board = {
    new BoardImpl
  }
  
  def getBeanFactory = {
    val factory: BeanFactory = new ClassPathXmlApplicationContext("file:src/main/validColours.xml")
    factory
  }
  
}