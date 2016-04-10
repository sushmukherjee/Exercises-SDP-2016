package Fao
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 01/04/2016.
  */
object Fao4 extends App {
  var s = ""
  val numbers = Vector(1, 2, 5, 3, 7)
  numbers.foreach(x => (s = s + (x*x + " ")))

  s is "1 4 25 9 49 "
}
