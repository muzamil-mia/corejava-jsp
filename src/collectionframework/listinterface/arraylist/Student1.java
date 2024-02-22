package collectionframework.listinterface.arraylist;

public class Student1 implements Comparable<Student1>{
	String name;
	double marks;
	int id;
	int rank;
	public Student1(String name, double marks, int id) {
		this.name = name;
		this.marks = marks;
		this.id = id;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", marks=" + marks + ", id=" + id + ", rank=" + rank + "]";
	}



	public int compareTo(Student1 o) {
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
