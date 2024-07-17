package HOF

object Lab1 extends App {
  // explicit function return type
  trait listOfSex{
    val male: Char = 'M'
    val female: Char = 'F'
  }
  val fn1: (String,(String)=>String=>String = (name: String, isSex:(String)=>String=>{
    s"$name is $isSex()"
  }

  val checkGender:(listOfSex, Char)=>String = (los:listOfSex ,sex: Char)=>{
    if(los.male == sex) "Male"
    else "Female"
  }
  println()
}
