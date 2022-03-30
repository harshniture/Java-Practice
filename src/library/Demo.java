package library;
import library.Book;
import library.FictionalBook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;
//client
public class Demo{
	public static void main(String args[]){
		/*
		Book b1 = new Book("Eye of the needle");
		FictionalBook b2 = new FictionalBook("Harry potter");
		
		b1.display();
		b2.display();
		b2.display(" is an amazing novel");
		
		Book b1 = FictionalBook.singletonFactory("Java");
		b1.display();
		Book b2 = FictionalBook.singletonFactory("Sherlock Holmes");
		b2.display();
		}
		
		//Abstract Class
		Synopsis t = new Thesis("My Thesis");
		t.displayContent();
		

		try {
			ArrayList al = new ArrayList();

			for(int i=0; i<10; i++){
				al.add(b);
			}
			for(int i=0; i<10; i++){
				Book b  = (Book) al.get(i);
				b.display();
			}
		}
		Iterator it = al.iterator();
		while(it.hasNext()){
			Book b = (Book) it.next();
			b.display();

		

		LinkedList ll = new LinkedList();
		ll.add(new Book("Java"));
			
		}
		*/

		Readable r = (String title) -> {
			System.out.println(title);
		};
		((FictionalBook) r).display("The prodigal Daughter");

		}


	}
}





