public class Demo {
	static void chargeWithMicroUsb(MicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.charge();
	}

	static void chargeWithLightning(LightningPhone phone) {
		phone.useLightning();
		phone.charge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iphone = new Iphone();

		System.out.println("-- Android with MicorUsb --");
		chargeWithMicroUsb(android);

		System.out.println("\n-- iPhone with Lightning --");
		chargeWithLightning(iphone);

		System.out.println("\n-- iPhone with MicorUsb (with Adapter) --");
		chargeWithMicroUsb(new LightningToMicroUsbAdapter(iphone));
	}
}