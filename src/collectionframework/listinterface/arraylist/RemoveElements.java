package collectionframework.listinterface.arraylist;

import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ravi");
		list.add("rani");
		list.add("sonu");
		list.add("vijay");
		System.out.println("an inital list of elements "+ list);
		
		//removing specific element
		list.remove("vijay");
		System.out.println(list);
		
		//removing element on the basis of specific position
		list.remove(0);
		System.out.println(list);
		
		//creating another arraylist
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hello");
		list2.add("hey");
		list2.add("how");
		//adding new elements to arraylist
		list.addAll(list2);
		System.out.println(list);
		//Removing all the new elements from arraylist
		list.removeAll(list2);
		System.out.println(list);
		
		//Removing all the elements
		list.clear();
		System.out.println(list);
	}

}
