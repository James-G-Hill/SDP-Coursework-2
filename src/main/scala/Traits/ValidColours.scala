package Traits

import Classes.Colours

trait ValidColours {

  def allColours: Array[Colours]

}

object ValidColoursImpl extends ValidColours {
  
  val allColours: Array[Colours] = {
    
    new Array[Colours](1)
    
  }
  
}