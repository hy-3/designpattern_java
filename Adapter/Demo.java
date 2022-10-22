public class Demo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "pop.mp3");
		audioPlayer.play("mp4", "jpop.mp4");
		audioPlayer.play("vlc", "kpop.vlc");
		audioPlayer.play("avi", "special.avi");
	}
}