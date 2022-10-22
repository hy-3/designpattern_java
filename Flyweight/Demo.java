public class Demo {
	public static void main(String[] args) {
		FamilyFactory familyFactory = FamilyFactory.getInstance();
		Family f1 = familyFactory.createFamily("Tanaka");
		Family f2 = familyFactory.createFamily("Suzuki");
		Family f3 = familyFactory.createFamily("Kato");
		Family f4 = familyFactory.createFamily("Tanaka");
		Family f5 = familyFactory.createFamily("Kato");

		System.out.println("f1(Tanaka) vs f2(Suzuki): " + f1.equals(f2));
		System.out.println("f1(Tanaka) vs f4(Tanaka): " + f1.equals(f4));
		System.out.println("f3(Kato)   vs f4(Tanaka): " + f3.equals(f4));
		System.out.println("f3(Kato)   vs f5(Kato)  : " + f3.equals(f5));
	}
}