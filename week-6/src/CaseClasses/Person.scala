package CaseClasses
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */
object TestPerson extends App {
  val p = Person("Jane", "Smile", "jane@smile.com")
  p.first is "Jane"
  p.last is "Smile"
  p.email is "jane@smile.com"
}



case class Person(first:String, last:String, email:String)
