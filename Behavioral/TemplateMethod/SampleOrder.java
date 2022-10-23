class OnlineOrder extends OrderTemplate {
	@Override
	public void Select() {
		System.out.println("Added to online cart.");
	}
	@Override
	public void Pay() {
		System.out.println("Paid by credit card.");
	}
	@Override
	public void Deliver() {
		System.out.println("Deliverd to the address.");
	}
}

class ShopOrder extends OrderTemplate {
	@Override
	public void Select() {
		System.out.println("Took an item from the shelf.");
	}
	@Override
	public void Pay() {
		System.out.println("Paid by cash.");
	}
	@Override
	public void Deliver() {
		System.out.println("The item was passed at the counter.");
	}
}