package ClothesWasher
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */

object TestClothesWasher2  extends App {
  val washer4 = new ClothesWasher2
  washer4.capacity is 2D
  washer4.model is "Unknown"

  val washer5 = new ClothesWasher2(model="AllInOne")
  washer5.capacity is 2D
  washer5.model is "AllInOne"

  val washer6 = new ClothesWasher2(capacity=3.6D)
  washer6.capacity is 3.6D
  washer6.model is "Unknown"
}




class ClothesWasher2(val model:String = "Unknown", val capacity:Double = 2D) {
  val cycles = 5
}

