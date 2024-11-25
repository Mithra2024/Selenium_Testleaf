package week2.day1;

public class LibraryManagement {
	public static void main(String[] args) {
		Library book=new Library();
		book.addBook("Meaning of Life");
		System.out.println(book.addBook("AutoBiography APJ"));
		book.issueBook();
		
	}

}
