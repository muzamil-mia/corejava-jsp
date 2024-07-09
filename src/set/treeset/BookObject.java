package set.treeset;

import java.util.TreeSet;

class Book implements Comparable<Book>{
	int id, qty;
	String name, author;
	public Book(int id, int qty, String name, String author) {
		super();
		this.id = id;
		this.qty = qty;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "\nBook [id=" + id + ", qty=" + qty + ", name=" + name + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book o) {
		return this.id - o.id;
	}
}

public class BookObject {

	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<Book>();
		set.add(new Book(2, 4, "java", "james gosleng"));
		set.add(new Book(1, 3, "html", "tim berner lee"));
		set.add(new Book(3, 3, "physics", "hc verma"));
		set.add(new Book(4, 4, "c++", "me"));
		System.out.println(set);
	}

}
