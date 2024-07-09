package java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class StreamOperations {

	public static void main(String[] args) {
		
		List<Employee> employees = employeeList();
		
		//stream methods / operations
		
		//1 -> Req : get all employee names as list
		
		//normal way
		List<String> names = new ArrayList<>();
		for(Employee emp : employees) {
			names.add(emp.getName());
		}
		
		System.out.println(names);
		
		//with stream
		Stream<Employee> employeeStream = employees.stream();
		//stream pipeline
		//List<String> alleEmployeeNames = employeeStream.map(emp -> emp.getName()).toList(); //map() is an intermediate method,  toList() is am terminal operation
		//System.out.println(alleEmployeeNames);
	}

	public static List<Employee> employeeList() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "one", "hyderabad", 43, "Male", "security", 2016, 20000));
		employeeList.add(new Employee(2, "Two", "pune", 35, "Male", "Finance", 2012, 30000));
		employeeList.add(new Employee(3, "Three", "banglore", 24, "Male", "IT", 2016, 200000));
		employeeList.add(new Employee(4, "Four", "hyderabad", 28, "Female", "Hr", 2012, 10000));
		employeeList.add(new Employee(5, "Five", "bbsr", 21, "Male", "sales", 2016, 150000));
		employeeList.add(new Employee(6, "Six", "chandigarh", 24, "Female", "acting", 2016, 30000));
		employeeList.add(new Employee(7, "Seven", "delhi", 32, "Male", "stand up", 2020, 120000));
		employeeList.add(new Employee(8, "Eight", "banglore", 43, "Male", "security", 2015, 20000));

		return employeeList;
	}

}
