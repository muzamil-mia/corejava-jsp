package collectionframework.sorting.comparator.lambdaexpression;

public class Student {
	String name;
	int id;
	float marks;
	public Student(String name, int id, float marks) {
		this.name = name;
		this.id = id;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
}
