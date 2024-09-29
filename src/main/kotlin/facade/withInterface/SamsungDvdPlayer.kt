package nsus.payment.facade.withInterface

class SamsungDvdPlayer: DvdPlayer {
  override fun on() {
    println("Samsung DVD Player is on")
  }
  
  override fun off() {
    println("Samsung DVD Player is off")
  }
  
  override fun play(movie: String) {
    println("Samsung DVD Player is playing $movie")
  }
  
  override fun stop() {
    println("Samsung DVD Player is stopped")
  }
  
  override fun eject() {
    println("Samsung DVD Player is ejecting")
  }
  
  override fun pause() {
    println("Samsung DVD Player is paused")
  }
  
  override fun setSurroundAudio() {
    println("Samsung DVD Player is set to surround audio")
  }
  
  override fun setTwoChannelAudio() {
    println("Samsung DVD Player is set to two channel audio")
  }
}
