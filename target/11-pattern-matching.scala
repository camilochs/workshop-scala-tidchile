object PatternMatchingExample extends App{

  def numberToChar(a:Int): String = a match {
    case 0 => "cero"
    case 1 => "uno"
    case 2 => "dos"
    case 3 => "tres"
    case 4 => "cuatro"
    case 5 => "cinco"
    case _ => "Superior a cinco."
  }

  println(numberToChar(4))
}

object PatternMatchingExample2 extends App{

  trait Hardware{
    val year: Int
    val model: String
  }
  case class Laptop(year: Int, model: String) extends Hardware
  case class Mobile(year: Int, model: String) extends Hardware

  def selectHardware(h:Hardware): String = h match {
    case Laptop(year, model) => s"Laptop $year model: $model"
    case Mobile(year, model) => s"Mobile $year model: $model"
  }
  val l = Laptop(2015, "LABC01")
  val m = Mobile(2018, "ABC01")
  println(selectHardware(l))
  println(selectHardware(m))
}