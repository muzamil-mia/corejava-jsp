package collectionframework.listinterface.arraylist;

import java.util.ArrayList;

public class SizeCapacity {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("the size of the array is " + list.size());
		
		ArrayList<Integer> list1 = new ArrayList<>(10);
		System.out.println(list1.size());
	}

}
