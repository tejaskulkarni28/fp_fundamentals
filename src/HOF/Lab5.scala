package HOF

import scala.util.Random

object Lab5 extends App {
  private val numbers = List(1, 2, 3, 4)
  private val chars = List('a', 'b', 'c', 'd')

  private val combine = numbers.flatMap(n => chars.map(c => "" + n + c))
  println(combine)

  // for-comprehensions is a short-hand for flatMap and map
  private val concatenate = for {
    n <- numbers
    c <- chars
  } yield "" + n + c
  println(concatenate)

  private val names = List("John", "Jack", "Jimmy")
  private val randomNumbers:Random = Random
  private val generateNumbersList = List.fill(names.length)(randomNumbers.nextInt(100))
  private val concatenateList = for{
    (name, randomNumber) <- names zip generateNumbersList
  }yield s"$name$randomNumber"
  println(concatenateList)
}
