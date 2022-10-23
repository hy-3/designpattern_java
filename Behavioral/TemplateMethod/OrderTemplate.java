public abstract class OrderTemplate {
	public boolean isGift;
	public abstract void Select();
	public abstract void Pay();
	public abstract void Deliver();
	public final void Wrap() {
		System.out.println("Wrapped as a gift.");
	}
	public final void processOrder(boolean isGift) {
		Select();
		Pay();
		if (isGift) {
			Wrap();
		}
		Deliver();
	}
}