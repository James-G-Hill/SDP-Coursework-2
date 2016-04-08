package Traits

import Classes.Colours

trait ValidColours {

  def allColours: Array[Colours]

}

object ValidColoursImpl extends ValidColours {
  
  def allColours: Array[Colours] = {
    
    new Array[Colours](1)
    
  }
  
}