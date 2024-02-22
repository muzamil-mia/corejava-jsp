package collectionframework.sorting.comparator;

public class Student1 {
	String name;
	int id;
	double marks;
	
	public Student1(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent1 [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
}
