public class Demo {
	public static void main(String[] args) {
		Reception reception = new Reception();
		String res = reception.checkBookForClient("Harry Potter");
		System.out.println(res);
		res = reception.checkBookForClient("Hard Things");
		System.out.println(res);
		res = reception.checkBookForClient("Science book");
		System.out.println(res);
	}
}