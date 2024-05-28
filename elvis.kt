fun main(args: Array<String>) {
  val name: String? = "john"
  val greeting = "Hello, ${name ?: "Guest"}"
  println(greeting)
}