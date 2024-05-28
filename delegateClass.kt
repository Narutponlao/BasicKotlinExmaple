interface DeliveryDelegate {
  fun deliver(origin: String, destination: String)
}

class DeliveryDelegateImpl() : DeliveryDelegate {
  override fun deliver(origin: String, destination: String) {
    println("Deliver from $origin to $destination")
  }
}

interface BankingDelegate {
  fun transferMoney(origin: String, destination: String, amount: Int)
}
class BankingDelegateImpl(): BankingDelegate {
  override fun transferMoney(origin: String, destination: String, amount: Int) {
    println("Transfer ${amount}THB from $origin to $destination")
  }
}

class SevenElevenStore(): DeliveryDelegate by DeliveryDelegateImpl() , BankingDelegate by BankingDelegateImpl()

fun main(args: Array<String>) {
  val store = SevenElevenStore()
  store.deliver("7-Eleven","Jay")
  store.transferMoney("Jay","Pajee",10000)

}