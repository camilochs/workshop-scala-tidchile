object OtherFunction extends App{

  val nums = (1 to 5).toList
  //fold
  val foldNums = nums.fold(0)(_ + _)
  println(foldNums)

  //filter
  val filterNums = nums.filter(_ % 2 == 0)
  println(filterNums)

  //map
  val mapNums = nums.map(List(_))
  println(mapNums)

  //flatmap
  val flatMapNums = nums.flatMap(List(_))
  println(flatMapNums)

  //combine: flatmap + map
  val combineNums = nums.flatMap(List(_)).map(_ > 2)
  println(combineNums)

  //zip
  val zipNums = nums.zip(nums.map(_ * -1))
  println(zipNums)

  //for-comprehension
  for {
    r <- nums
    e = r > 2
  } yield println(e)

}