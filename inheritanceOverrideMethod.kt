open class Shape {
  open fun getArea(): Double {
    return 0.0
  }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
  override fun getArea(): Double {
    return width * height
  }
}

fun main(args: Array<String>) {
  val rec = Rectangle(2.0,3.0)
  println(rec.getArea())
}