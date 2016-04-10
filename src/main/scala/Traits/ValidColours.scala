package Traits

import Classes.Colours
import Master.Factory
import java.util.HashMap

trait ValidColours {}

object ValidColoursImpl extends ValidColours {
  
  val allColours: HashMap[String, Colours] = {
    
    val codes: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val cols = new HashMap[String, Colours]()
    val factory = Factory.getBeanFactory
    
    for(i <- 0 to codes.length) {
      try {
        val colour = factory.getBean(codes.charAt(i).toString).asInstanceOf[Colours]
        cols.put(colour.code.toString, colour)
      }
      catch{case e: Exception => }
    }
    cols
  }
  
  def getColours(char: Char): Colours = {
    println("index is " + char)
    allColours get char.toString
  }
  
}