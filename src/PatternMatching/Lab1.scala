package PatternMatching
import scala.util.Random
object Lab1 extends App {
  // 1. Composition PM
  // 2. Sealed PM

  // 1. Composition PM
  val random = new Random()
  val randomNumber = random.nextInt(3)

  println(randomNumber)

  private val matchRandomNumber = randomNumber match{
    case 1 => "Number 1"
    case 2 => "Number 2"
    case 3 => "Number 3"
    case _ => "Something else" // <- wildcard underscore
  }
  println(matchRandomNumber)

}
