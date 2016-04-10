package ParamType


import atomicscala.src.com.atomicscala.AtomicTest._


/**
  * Created by sush on 31/03/2016.
  */
object TestParam_2 extends App {
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicitList(v1:Vector[Double]):List[Double] = {
    v1.toList
  }

}

