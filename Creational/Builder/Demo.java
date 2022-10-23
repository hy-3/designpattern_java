public class Demo {
	public static void main(String[] args) {
		Builder saltWaterBuilder = new SaltWaterBuilder();
		Director director = new Director(saltWaterBuilder);
		director.constract();
		SaltWater saltWater = (SaltWater) saltWaterBuilder.getResult();
		System.out.println("Solute: " + saltWater.getSalt() + ", Solvent: " + saltWater.getWater());
	}
}