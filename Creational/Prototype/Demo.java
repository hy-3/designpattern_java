public class Demo {
	public static void main(String[] args) {
		Prototype cp1 = new ConcretePrototype1();
		Prototype cp2 = new ConcretePrototype2();
		Prototype cloned_cp1 = null;
		Prototype cloned_cp2 = null;
		try {
			cloned_cp1 = cp1.clone();
			cloned_cp2 = cp2.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Error: " + e);
		}
		System.out.println("Clone done.");
	}
}
