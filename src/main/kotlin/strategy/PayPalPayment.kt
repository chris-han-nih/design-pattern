package nsus.payment.strategy

class PayPalPayment(
  private val email: String,
  private val password: String,
): PaymentStrategy {
    override fun pay(amount: Int) {
        println("Paid $amount using PayPal. ($email, $password)")
    }
}
