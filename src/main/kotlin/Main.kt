package nsus.payment

import nsus.payment.facade.withoutInterface.DvdPlayer
import nsus.payment.facade.withoutInterface.HomeTheaterFacade
import nsus.payment.facade.withoutInterface.SoundSystem
import nsus.payment.facade.withoutInterface.TV

fun main() {
    val homeTheaterFacade = HomeTheaterFacade(
        DvdPlayer(),
        SoundSystem(),
        TV()
    )

    homeTheaterFacade.watchMovie("Inception")
    homeTheaterFacade.endMovie()
}
