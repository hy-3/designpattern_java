class Vibration implements MobileAlertState {
	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println("vvvvv");
	}
	
}

class Silent implements MobileAlertState {
	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println(".....");
	}
}