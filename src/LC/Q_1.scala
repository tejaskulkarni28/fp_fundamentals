package LC

import scala.collection.mutable

object Q_1 extends App {
  private val numb = Array(2, 7, 11, 15)
  private val target = 9
  println(twoSum(numb, target).mkString)
  private def twoSum(numb: Array[Int], target: Int): Array[Int] = {
    var found: Boolean = false
    var result: Array[Int] = Array(-1, -1)
    for(i <- 0 until numb.length-1 if !found){
      for(j <- 1 until numb.length if !found){
        if(numb(i) + numb(j) == target){
          result = Array(i, j)
          found = true
        }
      }
    }
    result
  }

  // hashmap practice in scala
  val hashmap  = mutable.HashMap[Int, Int]()

  hashmap += (0 -> 2)
  hashmap += (1 -> 7)
  hashmap += (2 -> 11)
  hashmap += (3 -> 15)

  println(hashmap(1)) // inserting key to get the value
  println(hashmap.getOrElse(4, -1))

//  hashmap(2) = 12
//  hashmap -=2

  // same problem trying to solve using hashmap
  def usingHashMap(numbs: Array[Int], target: Int): Array[Int] = {
    var result: Array[Int] = Array(-1, -1)
    var found: Boolean = false
    var hashmap = mutable.HashMap[Int, Int]()
    for(i <- numbs.indices if !found){
      var compliment = target - numbs(i)
      if(hashmap.contains(compliment)){
        result = Array(hashmap(compliment), i)
        found = true
      }
      hashmap.put(numbs(i), i) // adding explicitly key-value pair
i    }
    result
  }
  println(usingHashMap(numb, target).mkString)

}
