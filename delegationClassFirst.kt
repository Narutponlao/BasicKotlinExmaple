interface Printer {
  fun printMessage(message: String)
}

class SimplePrinter : Printer {
  override fun printMessage(message: String) {
    println(message)
  }
}

class DelegatingPrinter(printer: Printer) : Printer by printer

fun main(args: Array<String>) {
val printer = SimplePrinter()
val delegatingPrinter = DelegatingPrinter(printer)
delegatingPrinter.printMessage("Hello, Delegation!")
}