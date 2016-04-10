package CaseClasses
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */
object TestPerson_1 extends App {
  val people = Vector(
    Person_1("Jane","Smile","jane@smile.com"),
    Person_1("Ron","House","ron@house.com"),
    Person_1("Sally","Dove","sally@dove.com"))
    people(0) is "Person_1(Jane,Smile,jane@smile.com)"
    people(1) is "Person_1(Ron,House,ron@house.com)"
    people(2) is "Person_1(Sally,Dove,sally@dove.com)"
}



case class Person_1(first:String, last:String, email:String)
