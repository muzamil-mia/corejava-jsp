package java8.MethodAndConstructorReference;

public interface MethodReferencesDemoTwo {
	
	public static void main(String[] args) {
		
		//using lambda
		EmployeeValidation validEmp = (Employee emp) -> {
			if(emp.getId() != 0 && emp.getName() != null) 
				return true;
			return false;
		};
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("muzamil");
		emp.setSalary(1000);
		boolean valid = validEmp.isValidEmployee(emp);
		System.out.println(valid);
		
		
		//Using method reference
		//sine we have one static method which is doing exactly same as above we are doing in lambda expression
		//we can use that method via method reference
		
		//static methods: class named
		//in the class name Employee invoke validEmployeeDetails method
		
		//EmployeeValidation validEmployee = Employee::validateEmployeeDetails;
		//here instead of defining lambda expression implementation we are simply reusing the existing method defined as part of Employee class with the concept of method references
		Employee emp2 = new Employee();
		EmployeeValidation validEmployee = emp2::validateEmployeeDetails;
		boolean isValid = validEmployee.isValidEmployee(emp2);
		System.out.println(isValid);
	}
}
