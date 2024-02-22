package collectionframework.sorting.comparable;


public class Student1BluePrint implements Comparable<Student1BluePrint> {

	String name;
	double marks;
	int id;

	public Student1BluePrint(String name, double marks, int id) {
		super();
		this.name = name;
		this.marks = marks;
		this.id = id;
	}

	// @Override
	public String toString() {
		return "\n [name=" + name + ", marks=" + marks + ", id=" + id + "]";
	}

//	public int compareTo(Student1BluePrint obj) {
//		if(this.id > obj.id)
//			return 1;
//		if(this.id < obj.id)
//			return -1;
//		return 0;
//		
//		//short trick
//	 //return this.id - obj.id but this cannot be used for double values
//}

//	 public int compareTo(Student1BluePrint obj) {
//		 return this.name.compareTo(obj.name);
//	 }

	// comparing multiple properties
	public int compareTo(Student1BluePrint obj) {
//		int m = Integer.compare(id, id);
//		int n = Double.compare(obj.marks, this.marks);
		int n = 0;
		if (this.marks > obj.marks) {
			n = -1;
		}else if (this.marks < obj.marks) {
			n = 1;
		}else {
			n = 0;
		}
		
		if(n == 0) {
			n = this.name.compareTo(obj.name);
		}
		if(n == 0) {
			n = this.id - obj.id;
		}
		return n;
	}
}
