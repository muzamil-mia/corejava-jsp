package java8.MethodAndConstructorReference;

@FunctionalInterface
public interface EmployeeValidation {
	
	//taking in emp details and checking id, name : true or else false
	boolean isValidEmployee(Employee emp);
}
