package Master

object Input {
  
  def getGuess(codeSize: Int): String = {
    var s: String = scala.io.StdIn.readLine()
    while(s.length != codeSize){
      println("Code is wrong length . . . please try again.\n")
      s = scala.io.StdIn.readLine()
    }
    s
  }
  
}