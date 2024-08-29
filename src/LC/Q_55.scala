package LC

object Q_55 extends App{
  def canJump(nums: Array[Int]):Boolean={
    val target = nums.length - 1
    def jump(currentIndex: Int, maxreach: Int):Boolean={
      if(currentIndex > maxreach) false
      else if(currentIndex >= target) true
      else jump(currentIndex + 1, math.max(maxreach, nums(currentIndex) + currentIndex))
    }
    jump(0, 0)
  }
  println(canJump(Array(0, 2)))
}
