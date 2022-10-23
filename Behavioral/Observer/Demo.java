public class Demo {
	public static void main(String[] args) {
		System.out.println("Enter text: ");
		EventSource eventSource = new EventSource();

		eventSource.addObserver(event -> {
			System.out.println("Received response: " + event);
		});

		eventSource.scanSystemIn();
	}
}