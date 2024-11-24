package nsus.payment.strategy

class CreditCartPayment(
  private val name: String,
  private val cardNumber: String,
): PaymentStrategy {
    override fun pay(amount: Int) {
        println("Paid $amount using Credit Card. ($name, $cardNumber)")
    }
}
