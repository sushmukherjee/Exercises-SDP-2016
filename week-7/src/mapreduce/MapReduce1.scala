package mapreduce
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 01/04/2016.
  */
object mapreduceOne extends App {
  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)
  v.map(n => n * 11+10) is Vector(21, 32, 43, 54)
}
