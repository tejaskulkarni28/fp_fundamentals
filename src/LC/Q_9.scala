package LC

import scala.annotation.tailrec

object Q_9 extends App {
  private def validPalindrome(x: Int):Boolean={
    @tailrec
    def recursiveMethod(n: Int, reminder: Int):Int = {
      if(n == 0) reminder
      else recursiveMethod(n/10,  reminder * 10 + n % 10)
    }
    if(x < 0)false
    else x == recursiveMethod(x, 0)
  }
  println(validPalindrome(123321))
}
