public class Demo {
	public static void main(String[] args) {
		Responsible p = new Parent();
		Responsible t = new Teacher();
		Responsible ht = new HeadTeacher();
		p.setNext(t).setNext(ht);
		p.putQuestion("How many snacks the kid can bring to the school trip?", 1);
		p.putQuestion("With whom will the kid go around during the trip?", 2);
		p.putQuestion("Which travel company should we choose?", 3);
		p.putQuestion("Will this trip be essencial in kid's life?", 4);
	}
}
