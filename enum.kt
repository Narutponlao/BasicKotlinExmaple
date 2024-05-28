enum class Color(val rgb: Int) {
  RED(0xFF0000),
  GREEN(0x00FF00);
  
  fun getHexCode(): String {
    return "#" + rgb.toString(16).padStart(6, '0')
  }
}
fun main(args: Array<String>) {
 println(Color.GREEN)
 println(Color.RED.ordinal)
 println(Color.RED.getHexCode())
 println(Color.RED.rgb)
}