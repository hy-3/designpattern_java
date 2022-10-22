public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Play Vlc, name: " + fileName);
	}
	@Override
	public void playMp4(String fileName) {}
}
