package Currying // converts multiple parameters into the sequence of the functions

object Lab1 extends App {

  private val remote = (plus: Boolean) => (minus: Boolean) => (currentTemp: Int) => (process: Int => Int) => {
    if(plus) {
      process(currentTemp + 1)
    }else if(minus){
      process(currentTemp-1)
    }else currentTemp
  }
//  private val justReturnModifiedTemperature: Int => Int = (modifiedTemp: Int) =>{
//    modifiedTemp
//  }
  private val justReturnModifiedTemperature1: Int => Int = identity
  private val IGotARemote = remote(true)(false)(20)(justReturnModifiedTemperature1)
  println(IGotARemote)
  
}
