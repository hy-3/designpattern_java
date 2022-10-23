public abstract class Responsible {
	private Responsible next = null;

	public Responsible setNext(Responsible next) {
		this.next = next;
		return next;
	}

	public final void putQuestion(String question, int questionLevel) {
		if (beAbleToJudge(question, questionLevel)) {
			judge(question);
		} else if (next != null) {
			next.putQuestion(question, questionLevel);
		} else {
			System.out.println("No one knows.");
		}
	}

	public abstract boolean beAbleToJudge(String question, int questionLevel);
	public abstract void judge(String question);
}