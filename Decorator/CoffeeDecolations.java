class WithMilk implements Coffee {
	private Coffee coffee = null;

	public WithMilk(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public double getCost() {
		return this.coffee.getCost() + 0.5;
	}

	@Override
	public String getIngredients() {
		return this.coffee.getIngredients() + " + Milk";
	}
}

class WithSuger implements Coffee {
	private Coffee coffee = null;

	public WithSuger(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public double getCost() {
		return this.coffee.getCost() + 0.2;
	}

	@Override
	public String getIngredients() {
		return this.coffee.getIngredients() + " + Suger";
	}
}