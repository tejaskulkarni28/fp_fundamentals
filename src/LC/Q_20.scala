package LC

import scala.annotation.tailrec
// NOTE: I TRIED TO SOLVE THIS PROBLEM NO 20 AND AS PER GIVEN 3 TEST CASES IT RAN AND PASSED BUT THE BELOW TESTCASE NO 76 FAILED. SO AGAIN I NEED TO APPLY STACK FOR THIS PROBLEM
// Wrong Answer
//76 / 98 testcases passed
//
//Editorial
//Input
//s =
//"{[]}"
//
//Use Testcase
//Output
//false
object Q_20 extends App {
  val s: String = "[](){}"
  def checkValidString(s: String):Boolean = {
    val stringArray: Array[Char] = s.toCharArray
    @tailrec
    def recursion(charArray: Array[Char], n: Int): Boolean = {
      if(n <= 1) false
      else if(n == 2) checkPair(charArray(n-2), charArray(n-2))
      else {
        if(checkPair(charArray(n-2), charArray(n-1))){ // n-2 should be p1 and n-1 p2 because of checkPair Sequence
          recursion(charArray, n-2)
        }else{
          false
        }
      }
    }
    recursion(stringArray, stringArray.length)
  }
  def checkPair(ch1: Char, ch2: Char): Boolean = {
    if(ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}' || ch1 == '(' && ch2 == ')') {
      true
    }else{
      false
    }
  }

  val result = checkValidString(s)
  println(result)
}
