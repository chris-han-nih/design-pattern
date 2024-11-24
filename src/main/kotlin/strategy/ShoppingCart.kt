package nsus.payment.strategy

class ShoppingCart(
  private val paymentStrategy: PaymentStrategy
) {
    fun pay(amount: Int) {
        paymentStrategy.pay(amount)
    }
}
