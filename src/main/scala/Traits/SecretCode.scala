package Traits

import scala.util.Random

trait SecretCode {

  def getCode: ColourSet

}

class SecretCodeImpl(codeSize: Int) extends SecretCode {
  
  val theCode: ColourSet = {
    
    var s = ""
    val vc = ValidColoursImpl.allColours
    
    for(a <- 0 to codeSize) {  
      val r = new Random(System.currentTimeMillis())
      val values = vc.values.toArray
      s = s + values(r.nextInt(values.size))
    }
    println(s)
    new ColourSet(s)
    
  }
  
  override def getCode: ColourSet = theCode
  
}