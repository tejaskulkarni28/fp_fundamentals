package HOF

object Lab2 extends App {
  // map collection
  private val list = List(1,2,3,4)
  println("\nMapping the list and checking weather the original list is changing or not")
  println(list)
  println(list.map(x=> x * 2)) // returns new list instead of changing the state of the original list
  println(list)


  // syntactic sugar
  println("\nSyntactic sugar")
  println(list.map(_ * 2))

  // appending letter 'A' times the number in list
  println("\nAppending letter A times the number in list")
  println(list.map(x => "A" * x))
}
