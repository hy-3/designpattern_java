import java.util.HashMap;

public class BookList {
	public String checkBookList(String bookName) {
		HashMap<String, String> bookList = new HashMap<String, String>();
		bookList.put("Harry Potter", "A2");
		bookList.put("Homo Sapiens", "B1");
		bookList.put("Hard Things", "C3");

		for (String book : bookList.keySet()) {
			if (book.equals(bookName))
				return bookList.get(book);
		}
		return null;
	}
}