package collectionframework.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		list.add(2);
		Collections.sort(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("e");
		Collections.sort(list1);
	}
}
