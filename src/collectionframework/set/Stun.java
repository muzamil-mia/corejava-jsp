package collectionframework.set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Stun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
//		
		Comparator<Student1> com = (s1,s2) -> s1.id-s2.id;
		if(p.equalsIgnoreCase("name")) {
			com = (s1, s2) -> s1.name.compareTo(s2.name);
		}else if(p.equalsIgnoreCase("marks")) {
			com = (s1,s2) -> (int)(s1.marks-s2.marks);
		}
		TreeSet<Student1> set = new TreeSet<>(com);
		set.add(new Student1(3, "zahid", 67.4));
		set.add(new Student1(3, "aqib", 90.5));
		set.add(new Student1(1, "irfan", 85.6));
		System.out.println(set);
	}
}

 class Student1  {
	int id;
	String name;
	double marks;
	public Student1(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nStudent1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}

