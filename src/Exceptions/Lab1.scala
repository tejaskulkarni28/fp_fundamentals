package Exceptions

object Lab1 extends App {
  val x: String = null
  println(x)
  // println(x.length)
  // ^ this will crash and throw null pointer exception
  // how can I throw exception here
  // throwing and catching exception
//  throw new NullPointerException
//  val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the throwable class
  // exception and error are the major throwable subtypes

  // 2. How to throw exceptions
  def getInt(withException: Boolean): Int = {
    if (withException) throw new RuntimeException("No INT for you!!!")
    else 22
  }

  val potentialFail = try{
    getInt(false)
  }catch{
    case e: RuntimeException => println("Caught a runtime exception")
  }finally { //weather the exception is caught or not it will run
    println("finally")
  }
  println(potentialFail)


  // how to define your own exceptions
  class MyException extends Exception{
    val exception = new MyException
    throw exception
  }
}
