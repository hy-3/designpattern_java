public class Demo {
	public static void main(String[] args) {
		BillingStrategy normal = BillingStrategy.NORMAL;
		BillingStrategy special = BillingStrategy.HAPPY_HOUR;

		Billing customerA = new Billing(normal);
		customerA.add(100, 1);
		customerA.add(50, 3);
		customerA.setStrategy(special);
		customerA.add(80, 1);
		customerA.print();

		Billing customerB = new Billing(special);
		customerB.add(100, 1);
		customerB.add(50, 3);
		customerB.setStrategy(normal);
		customerB.add(80, 1);
		customerB.print();
	}
}