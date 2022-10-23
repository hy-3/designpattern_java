public class AlertStateContext {
	private MobileAlertState currentState;

	public AlertStateContext() {
		this.currentState = new Vibration();
	}

	public void setState(MobileAlertState state) {
		this.currentState = state;
	}

	public void alert() {
		currentState.alert(this);
	}
}