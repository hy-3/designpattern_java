public class Iphone implements LightningPhone {
	private boolean connector;

	@Override
	public void useLightning() {
		connector = true;
		System.out.println("Lightning is connected");
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