package ParamType
import atomicscala.src.com.atomicscala.AtomicTest._


/**
  * Created by sush on 31/03/2016.
  */
object TestParam_1 extends App {
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicitDouble(d1:  Double, d2: Double, d3: Double):
  Vector[Double] = {
    Vector(d1, d2, d3)
  }
}
