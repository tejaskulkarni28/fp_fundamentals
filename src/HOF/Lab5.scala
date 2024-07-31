package HOF

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
}
