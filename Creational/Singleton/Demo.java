public class Demo {
	public static void main(String[] args) {
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		System.out.println(i1.equals(i2));

		// Singleton i3 = new Singleton(); //This code return error as expected.
		/*
			
			Demo.java:6: error: Singleton() has private access in Singleton
				Singleton i3 = new Singleton();
		*/
	}
}