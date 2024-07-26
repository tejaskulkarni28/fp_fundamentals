package HOF

object Lab3 extends App {
  // 1> Anonymous function
  // 2> Explicit function
  // 3> HOF -> also with syntactic sugar

  //  Anonymous function
  //  Implicit return type
  val fn1 = ()=>println("Hello! This is the anonymous function!")
  val fn2 = (name: String)=>name
  val fn3 = (id: Int, name: String)=> id + " " + name

  // Anonymous function
  // Explicit return type
  val fn4:(String)=>String = (name: String)=>String
  val fn5:(Int, String)=>String = (id: Int, name: String)=>String


  // Higher order function without anonymous function
  private def mountain(isWater: Boolean, waterfall: (Boolean) => Boolean): Boolean = {
    waterfall(isWater)
  }

  private def checkWaterFall(isWater: Boolean): Boolean = {
    isWater
  }

  println(mountain(isWater = true, checkWaterFall))

  // Higher order function with anonymous function
  private val mountain:(Boolean, (Boolean)=>Boolean)=>Boolean = (isWater: Boolean, waterFall: (Boolean)=> Boolean)=>{
    true
  }
}


