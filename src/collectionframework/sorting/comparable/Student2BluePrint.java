package collectionframework.sorting.comparable;


public class Student2BluePrint implements Comparable<Student2BluePrint> {

		String name;
		double marks;
		int id;
		int rank;
		public Student2BluePrint(String name, double marks, int id) {
			this.name = name;
			this.marks = marks;
			this.id = id;
			
		}
		
		
		


		public int compareTo(Student2BluePrint o) {
			int n = 1;
			if(this.marks > o.marks) {
				n = -1;
			}else if(this.marks < o.marks) {
				n = 1;
			}
			if(n == 0) {
				n = this.name.compareTo(o.name);
			}
			if(n == 0) {
				n = this.id - o.id;
			}
			return n;
		}

	}

