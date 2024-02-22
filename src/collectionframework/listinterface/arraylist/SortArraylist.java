package collectionframework.listinterface.arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class SortArraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("grapes");
		list.add("pineaple");
		list.add("apple");
		list.add("Babana");
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add("hello");
		list1.add("10");
		list1.add("hello");
		list1.add("language");
		
		Collections.sort(list1);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(2);
		//list2.add('c'); not possible
		list2.add(11);
		list2.add(5);
		Collections.sort(list2);
		System.out.println(list2);
		
	}

}
