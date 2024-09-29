package nsus.payment.facade.withoutInterface

class DvdPlayer {
  fun on() {
    println("DVD Player is on")
  }
  fun off() {
    println("DVD Player is off")
  }
  fun play(movie: String) {
    println("Playing $movie")
  }
  fun stop() {
    println("DVD Player is stopped")
  }
}
