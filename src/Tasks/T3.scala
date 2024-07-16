package Tasks

object T3 extends App {
  /*
      Define a function which takes an argument Int and returns another function which
      takes an Int and return and Int
   */
  def definingAFunction(arg: Int): Int ={
    def insideFunction(arg2: Int): Int ={
      arg2
    }
    arg
  }
  definingAFunction(101)
}
