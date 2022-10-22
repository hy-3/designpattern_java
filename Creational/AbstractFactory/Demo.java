public class Demo {
	public static AbstractHotPotFactory getFactory(String order) {
		AbstractHotPotFactory factory = null;

		if (order == "beef") {
			factory = new SpicyBeefHotPotFactory();
		} else if (order == "chicken") {
			factory = new MisoChickenHotPotFactory();
		} else if (order == "seafood") {
			factory = new SoySeafoodHotPotFactory();
		}
		return factory;
	}

	public static void main(String[] args) {

		System.out.println("-- 1st order --");
		String order = "beef";
		AbstractHotPotFactory factory = getFactory(order);
		factory.getSoup();
		factory.getIngredients();

		System.out.println("\n-- 2nd order --");
		order = "chicken";
		factory = getFactory(order);
		factory.getSoup();
		factory.getIngredients();

		System.out.println("\n-- 3rd order --");
		order = "seafood";
		factory = getFactory(order);
		factory.getSoup();
		factory.getIngredients();
	}


}