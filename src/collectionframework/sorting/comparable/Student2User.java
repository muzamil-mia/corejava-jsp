package collectionframework.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import collectionframework.listinterface.arraylist.Student1;

public class Student2User {
	public static void main(String[] args) {
		ArrayList<Student2BluePrint> list = new ArrayList<>();
		Student2BluePrint s1 = new Student2BluePrint("muzamil", 96, 0);
		Student2BluePrint s3 = new Student2BluePrint("zahid", 98, 1);
		Student2BluePrint s4 = new Student2BluePrint("raj", 90, 3);
		Student2BluePrint s5 = new Student2BluePrint("rani", 94, 4);
		list.add(s1);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		
		Iterator<Student2BluePrint> itr1 = list.iterator();

		Collections.sort(list);
		int i = 1;
		ListIterator<Student2BluePrint> itr = list.listIterator();
		while (itr.hasNext()) {
			Student2BluePrint obj = itr.next();
			obj.rank = i++;
			System.out.println(obj);
		}
	}
}
