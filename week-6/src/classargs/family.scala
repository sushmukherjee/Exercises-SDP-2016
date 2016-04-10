package classargs
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */
object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
}

class Family(member : String*) {
  def familySize():Int = {
    var count = 0
    for(i <- member) {
      count = count + 1
    }
    count
  }
}
