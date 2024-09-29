package nsus.payment.facade.withInterface

class BoseSoundSystem: SoundSystem {
    override fun on() {
        println("Bose sound system is on")
    }

    override fun off() {
        println("Bose sound system is off")
    }

    override fun setVolume(volume: Int) {
        println("Bose sound system volume set to $volume")
    }
}
