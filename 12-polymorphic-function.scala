object PolymorphicFunctionExample extends App{
  def operation[A](op: (A, A) => A, a: A, b: A): A = op(a, b)
  println(operation((a: Int, b:Int) => a + b, 4, 2))
  println(operation((a: Int, b:Int) => a - b, 4, 2))
  println(operation((a: Int, b:Int) => a * b, 4, 2))

  def equal[A, B](a: A, b: B): Boolean = {
    println(s"a is ${a.getClass}")
    println(s"b is ${b.getClass}")
    a == b
  }

  println(equal(10, 10.01))
}
