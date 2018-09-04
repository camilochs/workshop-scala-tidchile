object HOF_c{

  def sum(a:Int, b:Int): Int = a + b
  def sub(a:Int, b:Int): Int = a - b
  def mult(a:Int, b:Int): Int = a * b

  def operation(op: (Int, Int) => Int, a: Int, b: Int): Int = op(a, b)

  def main(args: Array[String]): Unit = {
    println(operation(sum, 3, 2))
    println(operation(sub, 3, 2))
    println(operation(mult, 3, 2))
  }
}