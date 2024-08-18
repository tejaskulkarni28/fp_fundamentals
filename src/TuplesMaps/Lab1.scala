package TuplesMaps

object Lab1 extends App {

  // tuples are finite ordered kind of lists
  val student: (Int, String) = (22, "Tejas Kulkarni")
  println(student._1)
  println(student._2)

  def studentInfo(roll: Int, name: String): (Int, String) = {
    (roll, name)
  }
}
