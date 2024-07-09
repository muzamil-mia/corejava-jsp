package java8.predefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		//Req: age > 21 years
		Predicate<Integer> ageCheck = age -> age > 21;
		System.out.println(ageCheck.test(31)); //true
		System.out.println(ageCheck.test(15)); //false
		
		if(ageCheck.test(22)) {
			System.out.println("eligible");
		}
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("dilip");
		emp.setSal(2200000);
		
		//test()
		Predicate<Employee> empSalaryCheck = emp1 -> emp1.getSal() > 210000;
		if(empSalaryCheck.test(emp)) {
			System.out.println("above 210000");
		}else {
			System.out.println("below 210000");
		}
		
		//salary > 250000 and Employee gender is female
		//and()
		Predicate<Employee> femaleCheck = emp1 -> emp1.getGender().equalsIgnoreCase("female");
		emp.setGender("female");
		boolean isTrue = empSalaryCheck.and(femaleCheck).test(emp);
		System.out.println(isTrue);
		
		//or()
		emp.setSal(0);
		isTrue = empSalaryCheck.or(femaleCheck).test(emp);
		System.out.println(isTrue);
		
		//negate
		isTrue = femaleCheck.negate().test(emp);
		System.out.println(isTrue);
		
		//Req : Employee: Have to validate other employees.
		//Employee : equals method
		Predicate<Employee> baseEmp = Predicate.isEqual(emp);
		
		//Employee object : find out salary > 25000
		Employee e2 = new Employee();
		e2.setId(12);
		e2.setGender("male");
		e2.setSal(25000);
		boolean result = baseEmp.test(e2);
		System.out.println(result);
	}

}
