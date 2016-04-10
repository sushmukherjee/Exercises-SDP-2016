package Tea
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  *
  *
  *
  */

object TeaScript extends App {
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}


class Tea(val teaBags:Int = 1,
          val decaf:Boolean = false,
          val milk:Boolean = false,
          val sugar:Boolean = false,
          val name:String = "Earl Grey") {
  def extras():String = {
    var text:String = ""
    if(decaf) text += " decaf"
    if(milk) text += " + milk"
    if(sugar) text += " + sugar"
    text
  }
  def calories():Int = {
    var total = 0
    if(milk) total = total + 100
    if(sugar) total = total + 16
    total
  }
  def describe():String = {
    name + extras
  }
}
