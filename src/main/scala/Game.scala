import main.scala.Traits.ValidColours

trait Game {
  
  /**
    * Run a one or more games of mastermind, until the player quits.
    */
  var codeSize: Int

  var allColours: ValidColours

  def runGames
  
}