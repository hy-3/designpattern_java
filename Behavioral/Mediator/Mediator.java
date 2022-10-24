interface Mediator {
	public void registerRunway(Runway runway);
	public void registerFlight(Flight flight);
	public boolean isLandingOk();
	public void setLandingState(boolean status);
}

class ATCMediator implements Mediator {
	private Flight flight;
	private Runway runway;
	public boolean land;

	public void registerRunway(Runway runway) {
		this.runway = runway;
	}

	public void registerFlight(Flight flight) {
		this.flight = flight;
	}

	public boolean isLandingOk() {
		return land;
	}

	@Override
	public void setLandingState(boolean status) {
		land = status;
	}
}