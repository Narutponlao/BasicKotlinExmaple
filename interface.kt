interface Drawable {
  fun draw()
  abstract val color: String
}

class Circle(override val color: String) : Drawable {
  override fun draw() {
    println("Drawing a circle with color: $color")
  }
}

fun main(args: Array<String>) {
 val circle = Circle("red")
 circle.draw()
}