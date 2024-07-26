package HOF

object Lab1 extends App {
  private def valueFor2(value:Int, multiplyBy2:(Int)=>Int):Int={
    multiplyBy2(value)
  }
  private val n = 2
  private def multiplyBy2(x: Int):Int = x * 2
  println(valueFor2(n,multiplyBy2))
}

