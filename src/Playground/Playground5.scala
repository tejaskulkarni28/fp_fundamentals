package Playground

object Playground5 extends App {
  // This playground4 is made for practicing map, flatmap and filter
  val list = List(1,2,3)
  println(list)

  println(list.head)
  println(list.tail)

  println(list.map(x=>x))
  println(list.filter(x => x % 2 == 0))
  println(list.flatMap(_.toString))
}
