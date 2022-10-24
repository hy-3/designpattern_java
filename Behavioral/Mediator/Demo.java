public class Demo {
	public static void main(String[] args) {
		Mediator atcMediator = new ATCMediator();
		Flight f101 = new Flight(atcMediator);
		Runway routeB = new Runway(atcMediator);

		atcMediator.registerFlight(f101);
		atcMediator.registerRunway(routeB);

		f101.getReady();
		routeB.land();
		f101.land();
	}
}