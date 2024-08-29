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

  // 2. Sealed PM
  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greetings: String) extends Animal

  // upcasting
  val Lucy:Animal = new Dog("Lhasa Apso")
  val result = Lucy match {
    case Dog(breed) => s"My breed is $breed"
    case _ => "Something else"
  }
  println(result)

}
