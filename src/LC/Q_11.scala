package LC

object Q_11 extends App {
  def function(height: Array[Int]):Int = {
    var left = 0
    var right = height.length-1
    var maxarea = 0
    if(height.length <= 1) 0
    while(left < right){
      maxarea = Math.max(maxarea, (left - right) * Math.min(height(left), height(right))) // updating the maxarea itself by inbuilt methods
      if(height(left) < height(right)){
        left = left + 1
      }
      else{
        right = right - 1
      }
    }
    maxarea
  }
  println(function(Array(1,8,6,2,5,4,8,3,7)))
}
