package collectionframework.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class NthHighestMarksStudent {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList();
		list.add(new Student(1,98.3,"raj"));
		list.add(new Student(4, 97, "kumar"));
		list.add(new Student(5, 83.5, "praveen"));
		list.add(new Student(3, 98.3,"sasi"));
		list.add(new Student(12,52,"thomsan"));
		list.add(new Student(7, 83, "sunil"));
		
		 TreeSet<Student> ts = new TreeSet(list);
		List<Student> list1 = new ArrayList(ts);
		System.out.println(list1.get(list1.size()-2));
		
	}

}

class Student implements Comparable<Student>{
	int id;
	double marks;
	String name;
	public Student(int id, double marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}

	

	@Override
	public int compareTo(Student o) {
		if(o.marks > this.marks) {
			return -1;
		}else if(o.marks < this.marks) {
			return 1;
		}
		return 0;
	}
}
