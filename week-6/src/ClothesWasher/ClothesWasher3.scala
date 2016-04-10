package ClothesWasher
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */


object TestClothesWasher3 extends App {
  val washer7 = new ClothesWasher3("LG 100", 3.6)
  washer7.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
  washer7.wash() is "Simple wash"

}
class ClothesWasher3(val model:String, val capacity:Double) {
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

  def wash(bleach:Int, fabricSoftener:Int):String = {
    "Wash used " + bleach + " bleach and " + fabricSoftener + " fabric softener"
  }

  def wash():String = {
    "Simple wash"
  }
}
