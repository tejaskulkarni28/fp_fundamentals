package Playground

object Playground2 extends App {
  // explicit higher-order function
  private val callHarish:(String, (String)=>String)=> String = (phone: String, process:(String)=>String)=>{
    process(phone)
  }

  private val processNumber:(String)=>String = (phone: String)=>{
    // Harish is an Indian so the prefix should be +91
    // So let's concatenate +91 to the String

    "+91-" + phone
  }

  print(callHarish("34545634598", processNumber))

}
