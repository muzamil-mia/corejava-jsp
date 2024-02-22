package collectionframework.listinterface.arraylist;

import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("ravi");
		list.add("raj");
		list.add("rani");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sonu");
		list1.add("sanu");
		list1.add("ravi");
		list.retainAll(list1);
		System.out.println(list); //ravi
		
		System.out.println(list.isEmpty());
	}

}
