object RTExample extends App{

  val x = "Workshop"
  val r1 = x.reverse
  val r2 = x.reverse

  val r3 = "Workshop".reverse
  val r4 = "Workshop".reverse

  println(s"r3: $r3")
  println(s"r4: $r4")
  println(r1 == r3)
  println(r2 == r4)

}

object RTExample2 extends App{

  val x = new StringBuilder("Workshop")
  val r5 = x.append(", TidChile").toString
  val r6 = x.append(", TidChile").toString
  println(s"r5: $r5")
  println(s"r6: $r6")
  println(r5 == r6)

}