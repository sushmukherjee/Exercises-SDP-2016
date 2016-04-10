package Fao
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 01/04/2016.
  */


object Fao1 extends App {

  var str1 = ""
  val numberV = Vector (1, 2, 3, 4)
  numberV.foreach (n => str1 += n + ",")
  str1 is "1,2,3,4,"
}




