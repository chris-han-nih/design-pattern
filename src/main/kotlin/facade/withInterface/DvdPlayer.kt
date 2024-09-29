package nsus.payment.facade.withInterface

interface DvdPlayer {
  fun on()
  fun off()
  fun play(movie: String)
  fun stop()
  fun eject()
  fun pause()
  fun setSurroundAudio()
  fun setTwoChannelAudio()
}
