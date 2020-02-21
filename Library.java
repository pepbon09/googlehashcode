import java.util.ArrayList;
import java.util.Scanner;

public class Library implements Comparable<Library>{

	private ArrayList<Book> books = new ArrayList<Book>();
	private int id;
	private int daysForScanning;
	private int shipCapacity;
	private int singupTime;
	private int booksPerDay;
	private long scoreOfLibrary;
	
	
	public Library(int id, int numBooks, int SignUpTime, int BooksPerDay) {
		
		Scanner sc = new Scanner(System.in);
		this.singupTime = SignUpTime;
		this.booksPerDay = BooksPerDay;
		
		for (int i = 0; i < numBooks; i++) {
			Book aux = new Book(sc.nextInt());
			books.add(aux);
		}
		
	}
	
	
	//Getters
	
	public int getTime() {
		return this.daysForScanning;
	}
	public int getBooksPerDay() {
		return this.booksPerDay;
	}
	public int getId() {
		return this.id;
	}


	@Override
	public int compareTo(Library l) {
		
		return this.singupTime - l.singupTime;
		
	}
	
	
	
	
}
