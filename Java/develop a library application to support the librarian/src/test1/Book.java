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
		System.out.println( title, "å�� ����");
		System.out.println( author, "å�� ����");
		System.out.println( catalougeNumber);
	}
	public Borrower getBorrower(){
		return borrower;
	}

}
