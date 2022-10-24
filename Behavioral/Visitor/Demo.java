public class Demo {
	public static void main(String[] args) {
		Element[] items = new Element[]{new Book(10), new Book(100), new Fruit(10, 2, "banana"), new Fruit(5, 5, "orange")};
		ShoppingVisitor visitor = new ConcreteShoppingVisitor();
		int sum = 0;
		for (Element item : items) {
			sum = sum + item.accept(visitor);
		}
		System.out.println("Total cost: " + sum);
	}
}