fun greet(name: String): String {
  return "Hello, $name!"
}

fun main(args: Array<String>) {
  val message = greet("Alice")
  println(message)
}