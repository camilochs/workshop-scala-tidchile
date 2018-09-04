object LazyExample extends App{

  //Not lazy
  val x = { println("a"); "c" }
  println("b")
  println(x)

}
object LazyExample2 extends App{

  //lazy
  lazy val x = { println("a"); "c" }
  println("b")
  println(x)

}

object LazyExample3 extends App{

  lazy val x = { println("a"); "c" }
  println("b")
  println(x)
  println(x)

}