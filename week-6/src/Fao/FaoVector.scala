package Fao
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 01/04/2016.
  */
object Fao3 extends App {
  val v = Vector(1, 5, 7, 8)
  val dogYears = (x: Int) => (x * 7)

  var s = ""
  v.foreach((x: Int) => (s = s + (dogYears(x) + " ")))
  s is "7 35 49 56 "
}
