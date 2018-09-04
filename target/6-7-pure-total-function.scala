object PureFunctionExample{

  def impure():Unit = println(s"Impure function")
  def pure(): String = s"Pure function"

  def main(args: Array[String]): Unit = {

    assert(pure == "Pure function")
    assert(impure() == "Impure function") //Error

  }
}
object PureFunctionExample2{

  def div(a:Double, b:Double): Option[Double] =
    if(b == 0)
      None
    else
      Some(a / b)
2
  def div2(a:Double, b:Double): Either[String, Double] =
    if(b == 0)
      Left("Error. Division por cero.")
    else
      Right(a / b)

  def main(args: Array[String]): Unit = {
    println(div(20, 10))
    println(div(20, 0))

  }
}

