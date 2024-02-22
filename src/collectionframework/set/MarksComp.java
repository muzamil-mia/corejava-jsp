package collectionframework.set;

import java.util.Comparator;

public class MarksComp implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.marks > o2.marks) {
			return -1;
		}
		if(o1.marks < o2.marks) {
			return 1;
		}
		return 0;
	}

}
