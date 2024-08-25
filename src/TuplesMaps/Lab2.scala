package TuplesMaps

object Lab2 extends App {
  val tuple: (Int, String) = (1, "A")
  println(tuple._1)
  println(tuple._2)

  def returnTuple(a: Int, b:String):(Int, String)={
    (a,b)
  }
  println(returnTuple(2, "A"))

  // working with MAP
  val aMap: Map[Int,String] = Map()

  val listOfBooks = Map(101->"Tejas", 102->"Shreyash")
  // a -> b is sugar for (a, b)
  println(listOfBooks.map(f=>f._1 -> f._2))
//  println(listOfBooks.map(f=>f._1 -> f._2))












  val names:Map[String, Int] = Map(
    "Shantanu" -> 24,
    "Tejas" -> 22,
    "Shreyash" -> 23
  )
  println(names.map(f=> (f._1, f._2))) // 1 means key and 2 means value







  def friendsOfEach(friends:Map[String, List[String]]):Unit={
    friends.foreach(pointer => {
      println(s"${pointer._1} friends are ${pointer._2.mkString(", ")}")
    })
  }
  val listOfAmeyFriends:List[String] = List("Darshan", "Pitke")
  val shreyash:List[String] = List("Tejas", "Digvijay")

  friendsOfEach(Map("amey's " -> listOfAmeyFriends))
  friendsOfEach(Map("shreyash's" -> shreyash))
}
