object LambdaFunctionExample extends App{

  val nums = (1 to 10).toList
  val lambda = (f: Int => Int, n: Int) => f(n) * -1
  nums.map(lambda((n:Int) => n * 1, _)).foreach(println(_))

}