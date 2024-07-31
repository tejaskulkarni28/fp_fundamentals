package HOF

object Lab4 extends App {
  // practicing hof -> return type is a function
  private val loop:(Int=>Int,Int)=>(Int=>Int)=(f:Int=>Int, n:Int)=>{
    if(n <= 0) (x:Int)=>x
    else (x:Int)=>loop(f, n-1)(f(x))
  }
  private val returnSomeThing = (x: Int)=>x
  private val output = loop(returnSomeThing, 10)(0)
  println(output) // will return some value based on the returnSomething function`
}
