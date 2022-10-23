public class Originator {
	private String state;

	public void set(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveToMemeto() {
		return new Memento(this.state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getSavedState();
	}

	public static class Memento {
		private final String state;

		public Memento(String stateToSave) {
			state = stateToSave;
		}

		private String getSavedState() {
			return state;
		}
	}
}