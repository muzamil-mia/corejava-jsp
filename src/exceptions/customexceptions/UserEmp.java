package exceptions.customexceptions;

public class UserEmp {

	public static void main(String[] args) throws SalaryInvalidException {
		Employee emp = new Employee("muzamil", "developer", 800);
		emp.setSal(1900);
		emp.display();
	}

}
