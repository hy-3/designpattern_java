public class Demo {
	public static void main(String[] args) {
		Expression person1 = new TerminalExpression("Kato");
		Expression person2 = new TerminalExpression("Tanaka");
		Expression isSingle = new OrExpression(person1, person2);

		Expression sato = new TerminalExpression("Sato");
		Expression committed = new TerminalExpression("Committed");
		Expression isCommitted = new AndExpression(sato, committed);

		System.out.println(isSingle.interpreter("Kato"));
		System.out.println(isSingle.interpreter("Tanaka"));
		System.out.println(isSingle.interpreter("Suzuki"));

		System.out.println(isCommitted.interpreter("Committed, Sato"));
		System.out.println(isCommitted.interpreter("Single, Sato"));
	}
}