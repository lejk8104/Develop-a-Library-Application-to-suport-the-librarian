package test1;
import java.util.*;

public class Libary {
	private String name;
	private TreeSet<Book> registeredBooks;
	private HashSet<Borrower> registeredBorrewers;
	private LinkedList<Book> displaybooksForloan;
	Private LinkedList<Book> displaybooksforAlreadyOfloan;
	
 	
	public Libary(String name){
		this.name = name;
		registeredBooks = new TreeSet<Book>();
		registeredBorrowers = new HashSet<Borrower>();
	}
	public void registerOneBorrower(String name){
		Borrower b = new Borrower(name);
		registeredBorrewers add(b);
	}
		public void registerOnebook(String title, String author, int Catalogue number){
		Book c = new Book(title, author, catalogue number)
		registeredBooks add(c);
	}
	public void displayBooksForLoan(){
		Iterator iter = registeredBooks.iterator();
		System.out.println("\n"+"Books available for loan");
		while(iter.hasNext(== true)){
		Book book =(Book)iter.next();
		if(book.getBorrower() == null){
			book.display();
	/*public void displayBooksAlreadyOutOfLoan(){
		Iterator iter = registeredBooks.iterator();
	}*/
	public void BorrowABook(){
		Book c = new Book(title, author, catalogue number)
		Borrower b = new Borrower(name);
		
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}

}
