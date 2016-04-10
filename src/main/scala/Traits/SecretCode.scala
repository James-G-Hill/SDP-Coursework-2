package Traits

import Classes.Colours
import scala.util.Random

trait SecretCode {

  def getCode: ColourSet

}

class SecretCodeImpl(codeSize: Int) extends SecretCode {
  
  val theCode: ColourSet = {
    
    var s = ""
    val vc = ValidColoursImpl.allColours
    
    for(a <- 0 to codeSize - 1) {  
      val r = new Random(System.currentTimeMillis())
      val values = vc.values.toArray
      s = s + values(r.nextInt(values.size)).asInstanceOf[Colours].code
    }
    new ColourSet(s)
  }
  
  override def getCode: ColourSet = theCode
  
  override def toString = {
    var s: String = ""
    for(i <- 0 to theCode.colours.length - 1){
      s = s + theCode.colours(i).desc + " "
    }
    s
  }
  
}