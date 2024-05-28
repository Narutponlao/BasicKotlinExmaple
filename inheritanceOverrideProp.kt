open class Base {
  open val value: Int = 5
}

class Derived : Base() {
  override val value: Int = 10
}

fun main(args: Array<String>) {
  val d = Derived()
  println(d.value)
}