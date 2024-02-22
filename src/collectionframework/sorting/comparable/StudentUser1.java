package collectionframework.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentUser1 {

	public static void main(String[] args) {
		ArrayList<Student1BluePrint> list = new ArrayList<>();
		list.add(new Student1BluePrint("kumar", 98, 1));
		list.add(new Student1BluePrint("raj", 98, 4));
		list.add(new Student1BluePrint("rani", 99, 3));
		
		//printing list before invoking sort method
		System.out.println(list);

		//printing list after invoking sort method
		Collections.sort(list);
		System.out.println(list);
	}

}
