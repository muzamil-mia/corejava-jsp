package collectionframework.sorting.comparable;

import java.util.Arrays;

public class Main  {

	public static void main(String[] args) {
		Student kunal = new Student(12, 89.76f);
		Student sushant = new Student(5, 80.76f);
		Student raj = new Student(3, 96.76f);

		Student rani = new Student(2, 97.76f);

		Student[] list = {kunal, sushant, raj, rani};
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		Arrays.sort(list, (o1,o2) -> (int)(o1.marks-o2.marks));
		
	      System.out.println(Arrays.toString(list));

//        if (kunal.compareTo(rahul) < 0) {
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("Rahul has more marks");
//        }

		
	}

}

class Student implements Comparable<Student>{
	int roll;
	float marks;
	
	public Student(int roll, float marks) {
		this.roll = roll;
		this.marks = marks;
	}
	
	public String toString() {
		return marks + " ";
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("in compare to method");
		int diff = (int)(this.marks - o.marks);
		return diff;
		
		//if diff == 0: means both are equal
		//if diff < 0: means o is bigger else o is smaller
	}
	
}