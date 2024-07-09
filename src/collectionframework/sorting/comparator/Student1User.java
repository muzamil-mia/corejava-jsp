package collectionframework.sorting.comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Student1User {

	public static void main(String[] args) {
//		ArrayList<Student1> list = new ArrayList<>();
//		list.add(new Student1("a", 1, 96.5));
//		list.add(new Student1("b", 3, 90.5));
//		list.add(new Student1("c", 2, 94.5));
		Student1 s1 = new Student1("a", 1, 96.5);
		Student1 s2 = new Student1("b", 3, 90.5);
		Student1 s3 = new Student1("c", 2, 94.5);
		List<Student1> list = Arrays.asList(s1,s2,s3);
		
		
		Collections.sort(list,new MarksComparator());
		System.out.println(list);
	}
}
