class SevenElevenStore {
  val storeName: String by lazy {
    println("computed")
    "Hello, Jay"
  }
}

fun main(args: Array<String>) {
  val store = SevenElevenStore()
  println(store.storeName)
  println(store.storeName)

}