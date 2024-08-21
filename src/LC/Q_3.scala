package LC

object Q_3 extends App {

  // abcabcbb <- testcase
  println(longestSubString("abcabcbb"))
  def longestSubString(s: String):Int= {
    // initialization
    var maxLength = 0
    var startWindow = 0
    var map = scala.collection.mutable.Map[Char, Int]()

    for (endWindow <- s.indices){
      val currentCharacter = s(endWindow)

      if(map.contains(currentCharacter)){
        startWindow = map(currentCharacter) + 1
      }

      map.put(currentCharacter, endWindow) // updating
      maxLength = Math.max(maxLength, endWindow - startWindow + 1)
    }
    maxLength
  }
}