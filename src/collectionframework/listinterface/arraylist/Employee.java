package collectionframework.listinterface.arraylist;

public class Employee {
	String name;
	int id;
	double sal;
	String job;
	public Employee(String name, int id, double sal, String job) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + ", job=" + job + "]";
	}

}
