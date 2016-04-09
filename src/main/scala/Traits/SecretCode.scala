package Traits

import scala.util.Random

trait SecretCode {

  def getCode: ColourSet

}

class SecretCodeImpl(codeSize: Int) extends SecretCode {
  
  val theCode: ColourSet = {
    
    var s = ""
    val vc = ValidColoursImpl.allColours
    
    var a = 0
    for(a <- 1 to codeSize) {
      
      val r = new Random(System.currentTimeMillis())
      val index = r.nextInt(vc.length)
      s = s + vc(index).code
    }
    
    new ColourSet(s)
    
  }
  
  override def getCode: ColourSet = {theCode}
  
}