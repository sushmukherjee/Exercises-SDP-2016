package Item
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */

object TestItem extends App {
  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4
  val sunscreen = new Item(
    name="sunscreen", 3)
  sunscreen.cost() is 3.3
  val tv = new Item(name="television", 500)
  tv.cost(Rate = 0.06) is 530

}


class Item(val name:String, var price:Int) {
  def cost(grocery:Boolean=false, medication:Boolean=false, Rate:Double=0.10):Double = {
    if(grocery || medication) price
    else price + (Rate * price)
  }
}
