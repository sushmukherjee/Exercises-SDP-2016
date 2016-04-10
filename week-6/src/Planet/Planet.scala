package Planet

import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */

object TestPlanet extends App {
  val p = new Planet(name = "Mercury",
    description = "small and hot planet", moons = 0)
  p.hasMoon is false

}

case class Planet(name: String, description: String, moons: Int) {

  def hasMoon(): Boolean = {
    if (moons > 0) {
      true
    } else {
      false
    }
  }
}
