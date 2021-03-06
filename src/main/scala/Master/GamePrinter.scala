package Master

import Classes.Colours
import collection.JavaConversions._
import Traits.{ValidColours, Board}

class GamePrinter(codesize: Int, validColours: ValidColours) {
  
  def welcome =
    "Welcome to Mastermind.\n\n" +
      "This is a text version of the classic board game Mastermind.\n\n" +
      "The computer will think of a secret code.\n" +
      "The code consists of " + codesize + " colored pegs.\n" +
      "The pegs may be one of " + validColours.allColours.size + " colors:" + colourList + "\n" +
      "A color may appear more than once in the code.\n\n" +
      "You try to guess what colored pegs are in the code and what order they are in.\n" +
      "After making a guess the result will be displayed.\n" +
      "A result consists of a black peg for each peg " +
      "you have exactly correct (color and position) in your guess.\n" +
      "For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n\n" +
      "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.\n" +
      "When entering guesses you only need to enter the first character of the color as a capital letter.\n\n" +
      "You have 12 turns to guess the answer or you lose the game. \n" +
      "Generating secret code ....\n\n"
      
  def colourList = {
    var s = ""
    for(colour: Colours <- validColours.allColours.values){
      s = s + " " + colour.desc + ","
    }
    s
  }

  def secretPrint(code: String) = {
    "The secret code is " + code + ".\n\n"
  }

  def guessPrint(n: Int) = {
    "You have " + n + " guesses left . . .\n\n"
  }

  def getGuess = {
    "What is your next guess?\n" +
    "Type in the characters for your guess and press enter.\n" +
    "Enter guess:\n"
  }

  def codePrint (code:String) = {
    code + " Secret Code\n"
  }

  def printBoard (board : Board, turn: Int) = {
    
    var output = ""
    
    val colourArray = board.colourArray
    val pegArray = board.pegArray
    
    for(i <- 0 to board.size - 1){
      if (i <= turn){
        output = output + colourArray(i).getGuess.toString
        output = output + " Result: "
        output = output + pegArray(i).toString
        output = output + "\n"
      } else {
        output = output + ". . . .\n"
      }
    }
    output = output + "\n"
    output
  }

  def wrong(board : Board, turn: Int) = {
    "You have " + (board.size - turn) + " guesses left\n\n"
  }

  def loser = {
    "You did not solve the puzzle. Too bad.\n"
  }

  def winner = {
    "You solved the puzzle! Good job.\n"
  }

}