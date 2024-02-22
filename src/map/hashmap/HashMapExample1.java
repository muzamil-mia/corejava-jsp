package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Book {
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "\nBook [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
}


public class HashMapExample1 {

	public static void main(String[] args) {
		Map<Integer, Book> map = new HashMap<Integer, Book>();
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
	    map.put(1, b1);
	    map.put(2, b2);
	    map.put(3, b3);
	    
	    //Ist way of traversing the map
	    Set<Integer> keys = map.keySet();
	    for(int k : keys) {
	    	System.out.println(k + " "+ map.get(k));
	    }
	    //Second way of traversing the map
	    Set entries =  map.entrySet();
	    for(Object obj : entries) {
	    	System.out.println(obj);
	    }
	    //Third way of traversing the map
	    Iterator itr = entries.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());n
	    }
	    
	}

}
