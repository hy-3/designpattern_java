public class Demo {
	public static void main(String[] args) {
		Mediator atcMediator = new ATCMediator();
		Flight f101 = new Flight(atcMediator);
		Flight f302 = new Flight(atcMediator);
		Runway routeB = new Runway(atcMediator);

		atcMediator.registerFlight(f101);
		atcMediator.registerRunway(routeB);

		System.out.println("-- flight: f101 --");
		routeB.land();
		f101.land();
		atcMediator.setLandingState(false);

		System.out.println("\n-- flight: f302 --");
		f302.land();
		routeB.land();
		f302.land();
	}
}