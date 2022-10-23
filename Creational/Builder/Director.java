public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constract() {
		builder.addSolute(100);
		builder.addSolvent(500);
		builder.addSolute(25);
	}
}
