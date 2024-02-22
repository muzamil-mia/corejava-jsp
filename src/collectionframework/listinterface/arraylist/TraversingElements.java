package collectionframework.listinterface.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("banana");
		list.add("mango");
		list.add("apple");
		list.add("ajay");
		list.add("rose");
		
		System.out.println("traversing the list through list Iterator");
		//here, element iterates in forward direction
		
//		ListIterator itr = list.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//traversing using list iterator in reverse order
//		ListIterator itr1 = list.listIterator(list.size());
//		while(itr1.hasPrevious()) {
//			System.out.print(itr1.previous() + " ");
//		}
		
		//traversing list through for loop
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
		
		//traversing through for each loop
//		for(String obj : list) {
//			System.out.print(obj + " ");
//		}
		
		//traversing using forEach() method
		System.out.println("traversing using for each method");
		list.forEach(a-> { //here we are using lambda expression
			System.out.print(a + " ");
		});
	}

}
