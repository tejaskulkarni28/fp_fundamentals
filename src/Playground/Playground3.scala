package Playground

object Playground3 extends App{
  // higher-order functions
  private val superFunction:(Int, (Int)=>AnyVal)=>AnyVal = (arg1: Int, subSuperFunction:(Int)=>AnyVal) => {
    superFunction(arg1, subSuperFunction)
  }
  print(superFunction)
}
object Playground4 extends App{
  private val superFunction1:(Int, (Int, (Int)=>AnyVal)=>AnyVal)=>AnyVal = (arg1: Int, subsuperFunction:(Int, (Int)=>AnyVal)=>AnyVal) =>{

  }
  private val superFunction2:(Int, (Int)=>AnyVal, (Int)=>AnyVal)=>AnyVal = (arg1: Int, subsuperFunction1:(Int)=>AnyVal, subsuperFunction2:(Int)=>AnyVal) =>{

  }
  private val superFunction3:(Int, (Int, (Int, (Int)=>AnyVal)=>AnyVal)=>AnyVal)=>AnyVal = (arg1: Int, subsuperFunction:(Int, (Int, (Int)=>AnyVal)=>AnyVal)=>AnyVal)=>{
    // this was badass
  }
}
