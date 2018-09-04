object HOF{

  def doubleValue(x: Int): Int = x * 2

  def main(args: Array[String]): Unit = {

    val indexes = (1 to 100 by 2).toList
    val newIndexes = indexes.map(doubleValue)
    newIndexes.foreach(println(_))

  }
}