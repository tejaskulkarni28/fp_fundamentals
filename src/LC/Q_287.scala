package LC

import scala.collection.immutable.HashSet

object Q_287 extends App {
  def findDuplicate(nums: Array[Int]): Int = {
    var hashset = HashSet[Int]()
    var result = 0
    var found: Boolean = false
    for(i<-nums.indices if !found){
      if(hashset.contains(nums(i))){
        result = nums(i)
        found = true
      }
      else hashset += nums(i)
    }
    result
  }
  val nums: Array[Int] = Array(1,3,4,2,2)
  println(findDuplicate(nums))
}
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//  You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//Example 1:
//
//  Input: nums = [1,3,4,2,2]
//  Output: 2
//  Example 2:
//
//    Input: nums = [3,1,3,4,2]
//  Output: 3
//  Example 3:
//
//    Input: nums = [3,3,3,3,3]
//  Output: 3