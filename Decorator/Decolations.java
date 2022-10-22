class WithMilk extends CoffeeDecorator {
	public WithMilk(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + " + Milk";
	}
}

class WithSuger extends CoffeeDecorator {
	public WithSuger(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.2;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + " + Suger";
	}
}