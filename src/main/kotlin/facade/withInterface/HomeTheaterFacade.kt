package nsus.payment.facade.withInterface

class HomeTheaterFacade(
    private val tv: TV,
    private val soundSystem: SoundSystem
): HomeTheater {
  
  override fun watchMovie(movie: String) {
    soundSystem.on()
    soundSystem.setVolume(10)
    tv.on()
    println("Watching $movie")
  }
  
  override fun endMovie() {
    soundSystem.off()
    tv.off()
  }
}
