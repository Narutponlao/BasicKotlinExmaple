fun String.connectString(): String {
  return "Hello "+ this
}
fun main(args: Array<String>) {
 val name = "Jay"
 println(name.connectString())
}