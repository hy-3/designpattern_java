public class Family {
	private String familyName;
	private String member;

	public Family(String name) {
		this.familyName = name;
	}

	public void getFamilyName() {
		System.out.println(this.familyName);
	}
}