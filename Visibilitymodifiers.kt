public class PublicClass {
  public fun publicFunction() {
    println("This is a public function, accessible from anywhere!")
  }
}

open class ProtectedClass {
  protected fun protectedFunction() {
    println("This is a protected function, accessible from ProtectedClass and its subclasses"+
    "in the same module")
  }
}

class SubClass: ProtectedClass() {
  fun callProtectedFunction() {
    protectedFunction()
  }
}

internal fun internalFunction() {
  println("This is an internal function, only accessible from within this module.")
}

class PrivateClass {
  private val privateProperty = "This is a private property, only accessible from within PrivateClass."
  
  private fun getPrivateProperty(): String {
    return privateProperty
  }
}
fun main(args: Array<String>) {
 val oj = PublicClass()
 oj.publicFunction()
}