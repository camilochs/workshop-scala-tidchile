import scala.collection.mutable.ArrayBuffer

object TraitExample{

  trait Currency{
    val name: String
  }

  case class Chile(name: String) extends Currency
  case class USA(name: String) extends Currency

  def main(args: Array[String]): Unit = {
    val chile = Chile("clp")
    val usa = USA("dollar")
    val currency = ArrayBuffer[Currency]()
    currency.append(chile)
    currency.append(usa)
    currency.foreach(o => println(o.name)) // clp, dollar
  }
}
