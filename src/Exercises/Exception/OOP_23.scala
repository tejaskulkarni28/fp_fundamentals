package Exercises.Exception

object OOP_23 extends App {
  /*
  1. Crash your program with an OutOfMemoryError
  2. Crash with SOError
  3. Pocket Calculator
    - add(x, y)
    - subtract(x, y)
    - multiply(x, y)
    - divide(x, y)

    Throw
      - OverflowException if add(x, y) exceeds Int.Max_Value
      - UnderflowException if sub(x, y) exceeds Int.Min_Value
      - MathCalculationException for division by 0
  */

  class Problem_1{
    // out-of-memory
    // occurs when it program runs out of heap memory
//    val array: Array[Int] = Array[Int]()
    val array: Array[Int] = new Array[Int](Int.MaxValue)
    for(pointer <- 0 to 1000){
      array(pointer) = pointer
      println(pointer)
    }
  }
  new Problem_1

  class Problem_2{
    def skeleton(n: Int):Int={
      def recursion(n: Int):Int={
        if(n <= 0) 0
        else {
          println(n)
          recursion(n-1) * 2
        }
      }
      recursion(n)
    }
    println(skeleton(100000))
  }
  new Problem_2 // wohh!! hehehe.. done

  class Problem_3{
      def add(x:Int, y:Int) = {
        if( x + y > Int.MaxValue){
          throw new StackOverflowError
        }else{
          x + y
        }
      }
      def subtract(x:Int, y:Int) = x - y
      def multiply(x:Int, y:Int) = x * y
      def divide(x:Int, y:Int) = x / y
  }
}
