package ClothesWasher
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */
object TestClothesWasher  extends App {
  val washer1 = new ClothesWasher
  washer1.capacity is 2D
  washer1.model is "Unknown"

  val washer2 = new ClothesWasher("AllInOne")
  washer2.capacity is 2D
  washer2.model is "AllInOne"

  val washer3 = new ClothesWasher(3.6)
  washer3.capacity is 3.6
  washer3.model is "Unknown"
}

class ClothesWasher(val model:String, val capacity:Double) {
  val cycles = 5

  def this(model:String) = {
    this(model, 2)
  }

  def this(capacity:Double) = {
    this("Unknown", capacity)
  }

  def this() = {
    this("Unknown", 2)
  }

}

