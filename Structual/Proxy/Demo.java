public class Demo {
	public static void main(String[] args) {
		PartTimeTeacher partTimeTeacher = new PartTimeTeacher();
		System.out.println("-- 1st class --");
		partTimeTeacher.teachMath();
		System.out.println("\n-- 2nd class --");
		partTimeTeacher.teachEnglish();
		System.out.println("\n-- 3rd class --");
		partTimeTeacher.teachHistory();
	}
}