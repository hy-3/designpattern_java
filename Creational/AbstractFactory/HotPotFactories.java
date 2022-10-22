class SpicyBeefHotPotFactory implements AbstractHotPotFactory{
	@Override
	public void getSoup() {
		System.out.println("Spicy soup");
	}

	@Override
	public void getIngredients() {
		System.out.println("Beef");
	}
}

class MisoChickenHotPotFactory implements AbstractHotPotFactory {
	@Override
	public void getSoup() {
		System.out.println("Miso base soup");
	}

	@Override
	public void getIngredients() {
		System.out.println("Chicken");
	}
}

class SoySeafoodHotPotFactory implements AbstractHotPotFactory {
	@Override
	public void getSoup() {
		System.out.println("Soy-sauce base soup");
	}

	@Override
	public void getIngredients() {
		System.out.println("Seafood");
	}
}
