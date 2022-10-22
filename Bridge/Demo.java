public class Demo {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(100);
		account.withdraw(75);

		if (account.isBalanceLow()) {
			account.setLogger(Logger.warning());
		}

		account.withdraw(10);
		account.withdraw(100);
	}
}