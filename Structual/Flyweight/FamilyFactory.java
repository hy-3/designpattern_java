import java.util.HashMap;

public class FamilyFactory {
	HashMap<String, Family> map = new HashMap<String, Family>();

	private static FamilyFactory singleton = null;

	private FamilyFactory() {}

	public static FamilyFactory getInstance() {
		if (singleton == null)
			singleton = new FamilyFactory();
		return singleton;
	}

	public Family createFamily(String name) {
		Family family = map.get(name);
		if (family == null) {
			family = new Family(name);
			map.put(name, family);
		}
		return family;
	}
}