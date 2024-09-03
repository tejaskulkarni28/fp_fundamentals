package LC

object t extends App{
  import scala.collection.mutable

  def fibMemo(n: Int, memo: mutable.Map[Int, Int] = mutable.Map()): Int = {
    if (n <= 1) return n

    // Check if the result is already computed and stored in memo
    if (memo.contains(n)) return memo(n)

    // Compute the result and store it in memo
    val result = fibMemo(n - 1, memo) + fibMemo(n - 2, memo)
    memo(n) = result
    result
  }
  println(fibMemo(45, mutable.Map()))

  def fib(n: Int): Int = {
    if (n <= 1) n
    else fib(n - 1) + fib(n - 2)  // Recalculates many overlapping subproblems
  }
  println(fib(45))
}
