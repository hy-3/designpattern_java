public class Reception {
	public String checkBookForClient(String bookName) {
		BookList bookList = new BookList();
		LendList lendList = new LendList();
		String location = bookList.checkBookList(bookName);
		if (location == null) {
			return "[" + bookName + "] We don't have that book in our library.";
		} else {
			if (lendList.isAvailable(bookName)) {
				return "[" + bookName + "] You can find it at " + location + ".";
			} else {
				return "[" + bookName + "] Unfortunately the book is currently checked out.";
			}
		}
	}
}