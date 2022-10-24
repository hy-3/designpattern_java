interface Command {
	void land();
}

class Flight implements Command {
	private Mediator atcMediator;

	public Flight(Mediator atcMediator) {
		this.atcMediator = atcMediator;
	}

	public void land() {
		if (atcMediator.isLandingOk()) {
			System.out.println("Successfully landed.");
			atcMediator.setLandingState(true);
		} else {
			System.out.println("Waiting for landing.");
		}
	}
}

class Runway implements Command {
	private Mediator atcMediator;

	public Runway(Mediator atcMediator) {
		this.atcMediator = atcMediator;
		atcMediator.setLandingState(true);
	}

	@Override
	public void land() {
		System.out.println("Landing permission granded");
		atcMediator.setLandingState(true);
	}
}