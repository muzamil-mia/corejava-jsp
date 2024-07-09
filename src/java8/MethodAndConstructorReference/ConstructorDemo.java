package java8.MethodAndConstructorReference;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		
		//Employee emp = new Employee()
		
		GetEmployeeInstance employee = Employee::new;
		Employee emp = employee.getEmployeeInstance(1, "DILIP");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		
	}

}
