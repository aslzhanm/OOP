package lab2.problem1.problemB;

abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	LibraryItem(String t, String a, int p){
		this.author = a;
		this.publicationYear = p;
		this.title = t;
	}
	
	String getAuthor() {
		return author;
	}
	
	String getTitle() {
		return title;
	}
	
	int getYear() {
		return publicationYear;
	}
	
	void setTitle(String t) {
		this.title = t;
	}
	
	void setAuthor(String a) {
		this.author = a;
	}
	
	void setYear(int y) {
		this.publicationYear = y;
	}
	
	public String toString() {
		return title + "\nAuthor: " + author + "\nPublication Year: " + publicationYear;
	}
}

class Book extends LibraryItem{
	private int numOfPages;
	private String genre;
	
	Book(String t, String a, int y, int n, String g){
		super(t, a, y);
		this.numOfPages = n;
		this.genre = g;
	}
	
	public String toString() {
		return "Book title: " + super.toString() + "\nPages: " + numOfPages + "\nGenre: " + genre;
	}
}

