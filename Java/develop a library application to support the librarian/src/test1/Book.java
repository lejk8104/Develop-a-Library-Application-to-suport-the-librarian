package test1;


public class Book implements Comparable {
	public String author;
	public String title;
	private int catalougeNumber;
	
	private Borrower borrewer;
	
	public Book(String author, String title, int catalogueNumber);
	this.title = title;
	this.author = author;
	this.catalogueNumber = catalougeNumber;
	
	Public void display(){
		System.out.println( title, "책의 제목");
		System.out.println( author, "책의 저자");
		System.out.println( catalougeNumber);
	}
	public Borrower getBorrower(){
		return borrower;
	}

}
