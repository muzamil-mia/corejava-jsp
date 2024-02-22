package collectionframework.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter property name");
		String s = sc.next();
		Comparator<Student> com = (o1, o2) -> o1.id - o2.id;
		if(s.equalsIgnoreCase("name")) {
			com = (o1,o2) -> o1.name.compareTo(o2.name);
		}else if(s.equalsIgnoreCase("marks")) {
			com = (o1,o2) -> {
				if(o1.marks > o2.marks) {
					return -1;
				}else if(o1.marks < o2.marks) {
					return 1;
				}
				return 0;
			};
		}
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(2, "muzamil",96));
		list.add(new Student(1, "zahid", 94));
		list.add(new Student(3, "sabit", 90));
		System.out.println(list);
		Collections.sort(list, com);
		System.out.println(list);
		System.out.println(list.get(1));
	}

}
