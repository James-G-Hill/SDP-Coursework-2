package Master

object Factory {
  
  def getInstance(c: Class[_], b: Boolean): Game = {
    new NewGame(b) 
  }
  
}