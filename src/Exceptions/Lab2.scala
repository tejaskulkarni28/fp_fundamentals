package Exceptions
import scala.util.Try
import scala.util.Success
import scala.util.Failure
object Lab2 extends App {
  // Handling failure _=>
  // {Try, Success, Failure}
  val aSuccess = Success(2)
  println(aSuccess)

  val aFailure = Failure(throw new RuntimeException("Failed!! Exception"))
  println(aFailure)

  val tryProbablity = Try(2) orElse aFailure
  println(tryProbablity)
}
