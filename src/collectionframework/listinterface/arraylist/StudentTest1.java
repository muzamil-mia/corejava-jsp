package collectionframework.listinterface.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class StudentTest1 {
	public static void main(String[] args) {
		ArrayList<Student1> list = new ArrayList<>();
		Student1 s1 = new Student1("muzamil", 96, 0);
		Student1 s2 = new Student1("sabit", 96, 2);
		Student1 s3 = new Student1("zahid", 98, 1);
		Student1 s4 = new Student1("raj", 90, 3);
		Student1 s5 = new Student1("rani", 94, 4);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		
		Collections.sort(list);
		int i = 1;
		ListIterator<Student1> itr = list.listIterator();
		while(itr.hasNext()) {
			Student1 obj = itr.next();
			obj.rank = i++;
			System.out.println(obj);
		}
		}
	}
