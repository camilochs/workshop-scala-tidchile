import scala.collection.mutable.ArrayBuffer

object MixinExample{

  trait A {
    val message: String
  }
  class B extends A {
    val message = "Instancia de B"
  }
  trait C extends A {
    def upperMessage = message.toUpperCase()
    def lowerMessage = message.toLowerCase()
  }
  class D extends B with C

  def main(args: Array[String]): Unit = {
    val d = new D
    println(d.message)
    println(d.upperMessage)
    println(d.lowerMessage)
  }
}

