public class Demo {
	public static void printInfo(Coffee coffee) {
		System.out.println("Cost: " + coffee.getCost() + ", Ingredients: " + coffee.getIngredients());
	}

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		printInfo(coffee);
		coffee = new WithMilk(coffee);
		printInfo(coffee);
		coffee = new WithSuger(coffee);
		printInfo(coffee);
	}
}