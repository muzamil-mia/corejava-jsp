package collectionframework.sorting.comparator;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student1> {
	
	public int compare(Student1 o1, Student1 o2) {
		if(o1.marks > o2.marks) {
			return  - 1;
		}else if(o1.marks < o2.marks) {
			return 1;
		}
		return 0;
	}
}
