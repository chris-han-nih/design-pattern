package nsus.payment.facade.withoutInterface

class HomeTheaterFacade(
    private val dvdPlayer: DvdPlayer?,
    private val soundSystem: SoundSystem,
    private val tv: TV
) {
  fun watchMovie(movie: String) {
    println("Get ready to watch a movie...")
    dvdPlayer?.on()
    soundSystem.on()
    tv.on()
    dvdPlayer?.play(movie)
  }
  
  fun endMovie() {
    println("Shutting movie theater down...")
    dvdPlayer?.stop()
    dvdPlayer?.off()
    soundSystem.off()
    tv.off()
  }
}
