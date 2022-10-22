public class BankAccount extends AbstractAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public boolean isBalanceLow() {
		return balance < 50;
	}

	public void withdraw(int amount) {
		boolean shouldPerform = balance >= amount;
		if (shouldPerform) {
			balance -= amount;
		}
		operate("withdraw " + amount, shouldPerform);
	}
}