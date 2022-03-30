package library;

public class FictionalBook extends Book {
	protected static int counter;
	public static FictionalBook fb;

	private FictionalBook(String title){
		super(title);
	}

	public static FictionalBook singletonFactory(String title){
		if (counter < 1){
			counter++;
			fb = new FictionalBook(title);
			return fb; 
		} else 
			return fb;
	}

	
		

	// overriding - chaning parameters, retaining the same name
	public void display(String feedback){
		System.out.println(this.title + " " + 
			feedback);
	}
	public void display(){
		System.out.println("Title: " + this.title + " is an amazing novel.");
	}
}
