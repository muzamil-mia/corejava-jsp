package collectionframework.sorting.comparator.lambdaexpression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentUser {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("muzamil", 2, 95.5f));
		list.add(new Student("sabit", 1, 90.5f));
		list.add(new Student("zahid", 3, 80.5f));
		
		System.out.println(list);
		/**
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id > o2.id) {
					return 1;
				}else if(o1.id < o2.id) {
					return -1;
				}
				return 0;
			}

		};
		Collections.sort(list, comp);
		System.out.println(list);
		*/
		Comparator<Student> comp = (o1,o2) -> {
			if(o1.id > o2.id) {
				return 1;
			}else if(o1.id < o2.id) {
				return -1;
			}
			return 0;
		};
		Collections.sort(list, comp);
		System.out.println(list);
		Collections.sort(list,(o1,o2) -> {
			return o1.name.compareTo(o2.name);
		});
		System.out.println(list);
	}

}
