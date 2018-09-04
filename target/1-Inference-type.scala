
object InferenceType{
  def main(args: Array[String]): Unit = {
    val text:String = "prueba"
    val num:Int = 10
    val numd:Double = 10.0
    val state:Boolean = true


    val text2 = "prueba"
    val num2 = 10
    val numd2 = 10.0
    val state2 = true

    println(text == text2)
    println(numd == numd2)
    println(state == state2)
  }
}




