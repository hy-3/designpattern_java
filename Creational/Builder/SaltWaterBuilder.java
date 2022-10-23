public class SaltWaterBuilder implements Builder {
	private SaltWater saltWater;

	public SaltWaterBuilder() {
		saltWater = new SaltWater(0, 0);
	}

	@Override
	public void addSolute(double solute) {
		saltWater.addSalt(solute);
	}
	@Override
	public void addSolvent(double solvent) {
		saltWater.addWater(solvent);
	}
	@Override
	public Object getResult() {
		return this.saltWater;
	}
}
