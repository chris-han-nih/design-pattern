package facade.withoutInterface

import io.kotest.core.spec.style.BehaviorSpec
import nsus.payment.facade.withoutInterface.TV
import nsus.payment.facade.withoutInterface.DvdPlayer
import nsus.payment.facade.withoutInterface.HomeTheaterFacade
import nsus.payment.facade.withoutInterface.SoundSystem

class HomeTheaterFacadeTest: BehaviorSpec({
    given("a home theater facade") {
        `when`("turning on the home theater") {
            then("all devices should be turned on") {
                val homeTheater = HomeTheaterFacade(
                    DvdPlayer(),
                    SoundSystem(),
                    TV(),
                )
                homeTheater.watchMovie("Inception")
            }
        }
    }
})

