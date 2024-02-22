package collectionframework.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Collections;
public class SortMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(0);
		list.add(10);
		list.add(7);
		
		//printing list before sorting
		System.out.println(list);
		//printing list after invoking sort() method
		Collections.sort(list);
		System.out.println(list);
		Integer num = 12;
		
		String str = "hello";
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("raj");
		list1.add("rani");
		list1.add("kumar");
		list1.add("kumari");
		
		//printing list1 before invoking sort method
		System.out.println(list1);
		
		//printing list1 after invoking sort method which is present in collections class which internally calls compareTo method which is present in Comparable interface
		Collections.sort(list1);
		System.out.println(list1);
	}

}
