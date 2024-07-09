package java8.MethodAndConstructorReference;

public class Employee {
	private int id;
	private String name, gender;
	private double salary;
	
	
	//static method
//	static boolean validateEmployeeDetails(Employee employee) {
//		if(employee.getId() != 0 && employee.getName() != null) {
//			return true;
//		}
//		return false;
//	}
	
	public Employee() {
		System.out.println("this is constructor with no data");
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("this is constructor refered from abstract method of functional interface with two arguments");
	}
	
	
	boolean validateEmployeeDetails(Employee employee) {
		if(employee.getId() != 0 && employee.getName() != null) {
			return true;
		}
		return false;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
