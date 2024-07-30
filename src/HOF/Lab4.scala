package HOF

object Lab4 extends App {
  private val loopNTimes:(Int=>Int, Int, Int)=>Int = (f:Int=>Int, x: Int, n:Int)=>{
    if(n <= 0) x
    else loopNTimes(f, f(x), n-1)
  }

  private val addOneNTimes:(Int)=>Int = (x: Int)=>{
    x + 1
  }

  println(loopNTimes(addOneNTimes, 0, 10))

  // In the above example loopNTimes(Int=>Int, Int, Int)->(f, x, n)
  // f is a function, x is just some value which will be injected in the function f and will be processed as per the
  // function we provide. And n is the number of times the recursion will run. (Like a for loop where i=0, i<10; i++)
}
