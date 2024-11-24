package nsus.payment

import nsus.payment.facade.withInterface.*
import nsus.payment.strategy.CreditCartPayment
import nsus.payment.strategy.ShoppingCart

fun main() {
    val homeTheaterFacade = HomeTheaterFacade(
        LGTV(),
        BoseSoundSystem()
    )
    homeTheaterFacade.watchMovie("Inception")
    homeTheaterFacade.endMovie()
    
    val shoppingCart = ShoppingCart(CreditCartPayment("Dave", "1234-5678-9012-3456"))
    shoppingCart.pay(100)
}
