package classargs
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */
object TestFlexibleFamily extends App {
  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3
}

class FlexibleFamily(mom:String, dad:String, kids:String*) {
  def familySize():Int = {
    2 + kids.size
  }
}

