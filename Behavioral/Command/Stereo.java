class Stereo {
	public void on() {
		System.out.println("Stereo is on");
	}
	public void off() {
		System.out.println("Stereo is off");
	}
	public void setCd() {
		System.out.println("CD is set to Stereo");
	}
	public void setDvd() {
		System.out.println("DVD is set to Stereo");
	}
	public void setRadio() {
		System.out.println("Radio is set to Stereo");
	}
	public void setVolume() {
		System.out.println("Volume is set to Stereo");
	}
}

class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	public void execute() {
		stereo.off();
	}
}

class StereoOnWithCdCommand implements Command {
	Stereo stereo;

	public StereoOnWithCdCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume();
	}
}
