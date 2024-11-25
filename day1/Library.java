package week2.day1;

public class Library {

 public String addBook(String bookTitle) {
	System.out.println(bookTitle+ "Book added Successfully");
	return bookTitle;
}
 public void issueBook() {
	 System.out.println("Book issued Successfully");
	}
public static void main(String[] args) {
	Library book=new Library();
	book.addBook("Ramayanam");
	System.out.println(book.addBook("Harry Potter"));
	book.issueBook();
	
}

}

