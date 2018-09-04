
object StaticallyType{

  def sum(a:Int, b:Int): Int = a + b

  def greaterThan(a:Int, b:Int): Int = if (a > b) a else b
  def greaterThanV2(a:Int, b:Int): Int = {
    if (a > b)
      a
    else
      b
  }

  def main(args: Array[String]): Unit = {
    println(sum(10, 20))
    println(greaterThan(10, 20))
  }
}
