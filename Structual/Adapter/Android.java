public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void useMicroUsb() {
		connector = true;
		System.out.println("MicroUsb is connected");
	}

	@Override
	public void charge() {
		if (connector) {
			System.out.println("charging");
		} else {
			System.out.println("wrong cable");
		}
	}
}