package collectionframework.sorting.comparator.lambdaexpression;

public class Employee {
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
