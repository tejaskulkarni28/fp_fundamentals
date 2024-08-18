package Sequences

object Sequences extends App {
  val aSequence = Seq(1,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2)) // have the value 3 here
  println(aSequence ++ Seq(5,6,7)) // ++ in scala is used to concatenate
  println(aSequence.sorted)


  // rangesss
  val aRange:Seq[Int] = 1 to 10
  val bRange:Seq[Int] = 1 until 10

  aRange.foreach(println)
  (1 to 10).foreach(x => println("Hello!"))

  val aList = List(1,2, 3)
  val prependedList = 4233:: aList
  println(prependedList)

  val applelist = List.fill(5)("apple")// fill is a curried function
  println(applelist)
  println(aList.mkString("     &^*&^&*    "))
}

