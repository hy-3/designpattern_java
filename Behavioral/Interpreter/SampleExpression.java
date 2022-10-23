class TerminalExpression implements Expression {
	String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	public boolean interpreter(String con) {
		if (con.contains(data)) {
			return true;
		}
		return false;
	}
}

class OrExpression implements Expression {
	Expression expr1;
	Expression expr2;

	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	public boolean interpreter(String con) {
		return expr1.interpreter(con) || expr2.interpreter(con);
	}
}

class AndExpression implements Expression {
	Expression expr1;
	Expression expr2;

	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	public boolean interpreter(String con) {
		return expr1.interpreter(con) && expr2.interpreter(con);
	}
}
