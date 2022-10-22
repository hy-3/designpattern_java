public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	private final LightningPhone lightningPhone;

	public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}

	@Override
	public void useMicroUsb() {
		System.out.println("MicroUsb with Adapter is connected");
		lightningPhone.useLightning();
	}

	@Override
	public void charge() {
		lightningPhone.charge();
	}
}