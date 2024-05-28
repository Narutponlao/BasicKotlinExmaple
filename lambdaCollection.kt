fun main(args: Array<String>) {
  val numbers = listOf(1,2,3,4,5)
  val evenNumbers = numbers.filter{ it % 2 == 0}
  println(evenNumbers)
  
  val number = listOf(1,2,3,4,5)
  val doubled = number.map{ it * 2}
  println(doubled)
}