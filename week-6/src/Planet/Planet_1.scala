package Planet
import atomicscala.src.com.atomicscala.AtomicTest._
/**
  * Created by sush on 31/03/2016.
  */

object TestPlanet_1 extends App {
    val earth = new Planet_1(moons = 1, name = "Earth",description = "a hospitable planet")
    earth.hasMoon is true

}


class Planet_1 (moons: Int,name: String, description: String) {

  def hasMoon(): Boolean = {
    if (moons > 0) {
      true
    } else {
      false
    }
  }
}
