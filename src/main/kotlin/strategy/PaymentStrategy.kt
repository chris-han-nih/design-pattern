package nsus.payment.strategy

interface PaymentStrategy {
    fun pay(amount: Int)
}
