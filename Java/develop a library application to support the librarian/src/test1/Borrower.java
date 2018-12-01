package test1;

public class Borrower implements Comparable {
	public String name;
	private LinkedList<Book> borrowedBooks;

	public Borrower(String name){
		this.name = name;
		borrowedBooks = new LinkedList<Book>();
	}
	public void display(){
		System.out.println( name , "이용자의 이름");
	})
}
