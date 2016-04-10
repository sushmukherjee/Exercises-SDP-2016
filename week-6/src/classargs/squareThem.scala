package classargs
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */

object TestsquareThem extends App {
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21
  def squareThem(x:Int*):Int = {
    var square = 0
    for(i <- x) {
      square = square + i*i
    }
    square
  }

}

