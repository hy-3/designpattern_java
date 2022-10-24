class Book implements Element {
	private int price;

	public Book(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	@Override
	public int accept(ShoppingVisitor visitor) {
		return visitor.visit(this);
	}
}

class Fruit implements Element {
	private int price;
	private int weight;
	private String name;

	public Fruit(int price, int weight, String name) {
		this.price = price;
		this.weight = weight;
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getName() {
		return this.name;
	}

	@Override
	public int accept(ShoppingVisitor visitor) {
		return visitor.visit(this);
	}
}
