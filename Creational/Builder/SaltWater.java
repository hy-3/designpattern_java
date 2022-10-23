public class SaltWater {
	private double salt;
	private double water;

	public SaltWater(double salt, double water) {
		this.salt = salt;
		this.water = water;
	}

	public double getSalt() {
		return this.salt;
	}
	public void addSalt(double salt) {
		this.salt += salt;
	}

	public double getWater() {
		return this.water;
	}
	public void addWater(double water) {
		this.water += water;
	}

}
