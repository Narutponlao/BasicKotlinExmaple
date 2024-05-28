class Person(val name: String, var age: Int) {
  fun greet() {
    println("Hello, my name is $name and I'm $age year old.")
  }
}

fun main(args: Array<String>) {
  val john = Person("John Doe", 30)
  john.greet()
}