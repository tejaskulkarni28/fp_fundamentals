package Sequences

object Arrays extends App {
  // arrays
  val numbers = Array(1, 2, 3, 4)
  val tree = Array.ofDim[String](3) // for string null and for int it is 0 for the default value
  tree.foreach(println)

  // implicit conversion from array to sequence
  val somearray: Array[Int] = Array(1,2,3,4)
  val someseq: Seq[Int] = somearray
  // if I print the someseq then I will get the WRAPPER ARRAY
  println(someseq)


  // multi-dimensional array in scala
  val arr: Array[Array[Int]] = Array.ofDim[Int](3, 4)// 3rows 4cols

  for(i<-0 until 3; j<-0 until 4){
    arr(i)(j) = i + j
  }
  println("Printing all the elements of 2D array:")
  for(i<-0 until  3){
    for(j <- 0 until 4){
      print(arr(i)(j) + " ")
    }
    println()
  }
}
