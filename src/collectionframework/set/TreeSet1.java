package collectionframework.set;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Student1> ts = new TreeSet(new MarksComp());
		ts.add(new Student1(1, "Raj", 85.5));
		ts.add(new Student1(4, "kumar", 97));
		ts.add(new Student1(5, "Praveen", 83));
		ts.add(new Student1(3, "sasi", 98.3));
		ts.add(new Student1(1, "tarun", 52));
		ts.add(new Student1(1, "sunil", 83));
		
		List<Student1> list = new LinkedList<Student1>(ts);
		System.out.println(list);
		int n = 4;
		System.out.println(list.get(n-2));
	}
}
