package Master

import Traits.ValidColoursImpl

object Input {
  
  def getGuess(codeSize: Int): String = {
   
    var s: String = scala.io.StdIn.readLine()
    s = s.toUpperCase
    
    while(s.length != codeSize || !ValidColoursImpl.checkColours(s)){
      println("Problem with code . . . please try again.\n")
      s = scala.io.StdIn.readLine()
    } 
    
    s
  }
}