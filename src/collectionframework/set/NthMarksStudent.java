package collectionframework.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class NthMarksStudent {

	public static void main(String[] args) {
		int n = 4;
		List<Student2> list = new ArrayList<Student2>();
		list.add(new Student2(1, "rajkumar", 98.3));
		list.add(new Student2(1, "rani", 98));
		list.add(new Student2(1, "arun", 53.3));
		list.add(new Student2(1, "sasi", 98.3));
		list.add(new Student2(1, "goldi", 80));
		list.add(new Student2(1, "gaju", 95.3));
		
		Comparator<Student2> marks = (s1, s2) -> {
			if(s1.marks > s2.marks) {
				return -1;
			}
			if(s1.marks < s2.marks) {
				return 1;
			}
			return 0;
		};
		
		TreeSet<Student2> ts = new TreeSet<Student2>(new MarksComp1());
		for(Student2 li : list) {
			ts.add(li);
		}
		
//		System.out.println(ts);
		List<Student2> list1 = new ArrayList<Student2>(ts);
		System.out.println(list1.get(n-1));
	}

}

class Student2 {
	int id;
	String name;
	double marks;
	public Student2(int id, String name, double marks) {
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

class MarksComp1 implements Comparator<Student2> {
	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.marks > o2.marks) {
			return -1;
		}
		if(o1.marks < o2.marks) {
			return 1;
		}
		return 0;
	}
}