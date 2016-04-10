package SimpleTime
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */

object TestSimpleTime extends App {
  val t = new SimpleTime(5, 30)
  t.hours is 5
  t.minutes is 30

}

class SimpleTime(val hr: Int , val mn : Int) {
  def hours():Int ={hr}
  def minutes():Int={mn}

}
