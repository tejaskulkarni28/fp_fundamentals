package Playground

object Playground6 extends App{
  // Practice, Revise all the teachings till now! Just going to make this file as a rough page of the notebook

  // What is scala ?
  // Scala is a static type language which means that every declared variable should have its type
  // Scala can be written in Object Oriented Language as well as Pure functional language
  // Scala has frameworks like play, it also has toolkits like akka which has many features init but for now I don't know Akka things and play
  // But play framework is based on MVC model which I knows that is M means Model V means View and C means Controllers
  // View has all the front-end stuff => Model has all the Database things and => Controllers kind of main thing where all the business logic works.
  // Scala also works perfect with JAVA and Scala compiles on JVM that is JAVA VIRTUAL MACHINE

  // Now I will start with all the fundamental things

  // 1) Val and Var
  val a = 2
  //a = 3 doesn't works because val is an immutable declaration

  var b = 2
  b = 3 // works because var is a mutable declaration

  // 2) Functions and Methods
  def isaMethod(hasParameters: String, someAnotherParameter: Int, alsoSomeFunction: (Int)=>Boolean): String = {
    "Yah! so these are some parameter examples where you can have primitive datatype as well as inject a function as a higher order function"
  }

  val aFunction: String = "Some random string"
  val aFunctionWithPara: Boolean = true

  // 3) Anonymous functions!!!Yhoo!!
  val anonymousFunction:(Int, String)=>Boolean = (a: Int, b: String)=>{
    true
  }
  val anonymousFunctionWithNested:(Int, (Int)=>Int)=>Boolean = (a: Int, f:(Int)=>Int)=>{
    true
  }


  // case class can be implemented but can only extended from the abstract base class
  // case class has some pre-defined features which can be useful in short boiler code
  // like apply method, copy method where you can directly copy an instance and make use of it
  // also useful in serialization: means formating data into structured sequence where it can be stored easily
  // case classes are final in default and is used mostly to model immutable data

  case class withImplementation(p1: String, p2: Boolean) {
    def a: String = "Case class"
  }
//  class Test extends  withImplementation(String, true){
//    // here I can extend but if I want to use more stricter case class then I should not implement the methods in the case class
//  }

  case class withOutImplementation(p1: String, p2: String)
//  class Test1 extends withOutImplementation(String, String){
//    def printSomeThing:String = "haksjdhas"
//  }

//  println(new withImplementation("a", true).a)

  // Ideally you should not extend the case classes to ensure the immutable model

  // Define a case class
  case class Person(name: String, age: Int)

  // Attempt to extend the case class with another class
  class Employee(name: String, age: Int, jobTitle: String) extends Person(name, age) {
    def getJobTitle: String = jobTitle
  }

  // Trying to instantiate the Employee class
  object Test extends App {
    val emp = new Employee("Alice", 30, "Engineer")
    println(s"${emp.name}, ${emp.age}, ${emp.getJobTitle}")
  }


  // auxiliary constructors > 1st constructor
  class AuxiliaryConstructors(p1: String, p2: Int){
    def this(p1: String, p2: Int){
      this(p1, p2)
    }
    def this(p2:Int) {
      this(p1, 2)
    }
  }

}
