package Lambdas

object Lab2 extends App {
  // Implicit type
  val giveSomething = (thing: AnyVal)=> thing
  // Explicit type
  val giveName: (String)=>String = (name: String) => {
    name
  }
}

