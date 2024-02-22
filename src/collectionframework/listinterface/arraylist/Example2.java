package collectionframework.listinterface.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class Example2 {

	public static void main(String[] args) {
		//iterating the list using Iterator
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("orrange");
		list.add("grapes");
		
		
		//printing list
		System.out.println(list);
		
		//printing list using for loop
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		//printing list using for each loop
		for(String ob : list) {
			System.out.print(ob + " ");
		}
		//traversing list through Iterator
		Iterator itr = list.iterator(); //getting the iterator
		while(itr.hasNext()) { //check if iterator has the elements
			System.out.println(itr.next());//printing the elements and move to next
		}
		
		list.set(0, "20"); //it will replace element at position one with "20"
		System.out.println(list);
		
		System.out.println(list.get(2));//it will return the third element
	}

}
