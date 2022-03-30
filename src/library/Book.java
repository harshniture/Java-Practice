package library;

public class Book {
	protected String title; //= null;

	public Book(String title){
		this.title=title;
	}

	public void display() {
		System.out.println("Title: " + this.title);
	}
}