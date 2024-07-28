package Lambdas // also called anonymous functions

object Lab1 extends App {
  // Inferred return type
  private val fn1 = (a: Int, b: Int) => a + b

  println(fn1(2,2))
}
object Lab2 extends App{
  // Explicitly return type
  private val fn1:(Int, Int)=>Int = (a: Int, b: Int)=> a + b

//  private val fn1:(Int, Int)=>Int  lhs
//  (a: Int, b: Int)=> a + b  rhs
  println(fn1(2,2))
}
object Lab3 extends App{
  private val fn1:(String, Int, Boolean)=>Boolean = (a: String, b: Int, c: Boolean)=>true

  fn1("", 1 ,true)
}

