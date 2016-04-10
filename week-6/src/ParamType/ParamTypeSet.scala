package ParamType

/**
  * Created by sush on 01/04/2016.
  */


import atomicscala.src.com.atomicscala.AtomicTest._


/**
  * Created by sush on 31/03/2016.
  */
object TestParam_3 extends App {
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicitSet(v1:Vector[Double]):Set[Double] = {
    v1.toSet
  }
  }







