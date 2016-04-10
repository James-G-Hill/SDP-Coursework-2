package Traits

import Classes.Colours
import Master.Factory

trait ValidColours {

  def allColours: Array[Colours]

}

object ValidColoursImpl extends ValidColours {
  
  val allColours: Array[Colours] = {
    
    val codes: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val cols = new Array[Colours](6)
    val factory = Factory.getBeanFactory
    
    for(i <- 0 to codes.length) {
      try {
        val colour = factory.getBean(codes.charAt(i).toString).asInstanceOf[Colours]
        cols(i) = colour
      }
      catch{case e: Exception => }
    }
    
    cols
  }
  
  def getColours(char: Char): Colours = {
    allColours(allColours.indexOf(char))
  }
  
}