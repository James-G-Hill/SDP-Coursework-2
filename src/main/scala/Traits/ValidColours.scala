package Traits

import Classes.Colours
import Master.Factory
import java.util.HashMap

trait ValidColours {val allColours: HashMap[String, Colours]}

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
    allColours get char.toString
  }
  
  def checkColours(s: String): Boolean = {
    var valid = true
    for(i <- 0 to s.length - 1) {
      if(!allColours.containsKey(s.charAt(i).toString)){
        valid = false
      }
    }
    valid
  }
}