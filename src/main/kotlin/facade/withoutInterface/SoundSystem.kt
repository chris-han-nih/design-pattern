package nsus.payment.facade.withoutInterface

class SoundSystem {
  fun on() {
    println("SoundSystem is on")
  }
  fun off() {
    println("SoundSystem is off")
  }
  fun setVolume(volume: Int) {
    println("Volume is set to $volume")
  }
}
