public class Demo {
	public static void main(String[] args) {
		System.out.println("-- online --");
		OrderTemplate onlineOrder = new OnlineOrder();
		onlineOrder.processOrder(true);
		System.out.println("\n-- store --");
		OrderTemplate shopOrder = new ShopOrder();
		shopOrder.processOrder(false);
	}
}