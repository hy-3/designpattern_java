import java.util.List;
import java.util.ArrayList;
import java.util.function.IntUnaryOperator;

enum BillingStrategy {
	NORMAL (p -> p),
	HAPPY_HOUR (p -> p/2);

	private final IntUnaryOperator strategy;

	BillingStrategy(IntUnaryOperator strategy) {
		this.strategy = strategy;
	}

	int getPrice(int rawPrice) {
		return this.strategy.applyAsInt(rawPrice);
	}
}

public class Billing {
	private final List<Integer> drinks = new ArrayList<>();
	private BillingStrategy strategy;

	public Billing(BillingStrategy strategy) {
		this.strategy = strategy;
	}

	public void add(int price, int quantity) {
		this.drinks.add(this.strategy.getPrice(price * quantity));
	}

	public void print() {
		int sum = this.drinks.stream().mapToInt(v -> v).sum();
		System.out.println("Total: " + sum);
		this.drinks.clear();
	}

	public void setStrategy(BillingStrategy strategy) {
		this.strategy = strategy;
	}
}