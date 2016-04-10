package SimpleTime
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */

object TestSimpleTime2 extends App {
  val t = new SimpleTime2(10)
  t.hours is 10
  t.minutes is 0

}

class SimpleTime2(val hr: Int , val mn : Int=0) {
  def hours():Int ={hr}
  def minutes():Int={mn}

}
