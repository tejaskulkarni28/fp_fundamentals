package Currying

object Lab1 extends App {
  private val currying:Int=> Int => Int = x => y => x + y
  print(currying(2)(3))
}
