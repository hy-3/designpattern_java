import java.util.HashMap;

public class LendList {
	public boolean isAvailable(String bookName) {
		HashMap<String, Integer> bookList = new HashMap<String, Integer>();
		bookList.put("Harry Potter", 0);
		bookList.put("Homo Sapiens", 0);
		bookList.put("Hard Things", 1);
	
		if (bookList.get(bookName) == 1)
			return true;
		else
			return false;
	}
}