package collectionframework.listinterface.arraylist;

import java.util.ArrayList;

public class AddingElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("raj");
		list.add("ravi");
		list.add("rani");
		System.out.println("After invoking add(E e) method: " + list);
		//Adding an element at the specific position
		list.add(1, "Gaurav");
		System.out.println("After invoking add(int index,E element) method: "+list);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("sonu");
		list2.add("sanu");
		//Adding second list elements to the first list
		list.addAll(list2);
		System.out.println("After invoking addAll(Collection c) method "+list);
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("suraj");
		list3.add("saourab");
		list.addAll(2, list3);
		System.out.println("After invoking addAll(int index, Collecton c) method " + list);
	
		ArrayList list4 = new ArrayList();
		list4.add(10);
		list4.add(12);
		list.addAll(list4);
		System.out.println(list);
	}

}
