package Playground

object Playground1 extends App {
  // explicit higher-order functions
  val fn1:(Int, (Int)=>AnyVal)=>AnyVal= (id: Int, designation: (Int)=>AnyVal)=>{
    designation(id)
  }
  private val designation:(Int)=>Int = (a: Int)=>{
    a * 2
  }
  print(fn1(4, designation))
}
