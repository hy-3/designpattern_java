class ConcreteShoppingVisitor implements ShoppingVisitor {
	@Override
	public int visit(Book book) {
		int cost = 0;
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}
		System.out.println("Book cost: " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPrice() * fruit.getWeight();
		System.out.println("Fruit cost: " + cost);
		return cost;
	}
}
