package TuplesMaps

object Lab1 extends App {

  // tuples are finite ordered kind of lists
  val student: (Int, String) = (22, "Tejas Kulkarni") // this is a tuple
  println(student._1)
  println(student._2)

  def studentInfo(roll: Int, name: String): (Int, String) = {
    (roll, name)
  }
  println(studentInfo(student._1, student._2))
  val teachers: (Int, String, Boolean) = (101, "Maths", true)
  def teachersInfo(id: Int, subject: String, active: Boolean):(Int, String, Boolean)={
    (id, subject, active)
  }
  println(teachers._1)
  println(teachers._2)
  println(teachers._3)

  println(teachersInfo(teachers._1, teachers._2, teachers._3))


  // tuples if you want to return multiple values from a function
}
