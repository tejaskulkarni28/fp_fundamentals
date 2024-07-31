package HOF

object Lab5 extends App {
  // loop till 10 from 0 to 10 which means it will loop till 11
  // take a x variable and return x * 2 where x initially is 1 n times till the loop ends
  // take x as a function as a return type and return its final value
  private val loopNTimes:(Int=>Int, Int)=>(Int=>Int) = (f:Int=>Int, n:Int) =>{
    if(n<=0){
      // return a function because the return type is a function
      (x: Int)=>x
    }else{
      // recursion till n becomes equal to 0 or less than 0
      // return type is a function so I need to return as a function even I need to call the same function for a recursion purpose
      (x:Int)=>loopNTimes(f, n-1)(f(x))
    }
  }
  private val multiplyX = (x:Int)=>x * 2
  private val otp = loopNTimes(multiplyX, 10)(1)
//  private val otp(1) = loopNTimes(multiplyX, 10)
//  otp(1) is equivalent to loopNTimes(multiplyX, 10)(1).
  println(otp)
}
