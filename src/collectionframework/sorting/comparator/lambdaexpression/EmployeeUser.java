package collectionframework.sorting.comparator.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeUser {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(2, "a", 40000));
		list.add(new Employee(3, "b", 35000));
		list.add(new Employee(1, "c", 25500));
		list.add(new Employee(4, "d", 15000));
		double total = 0;
		for(Employee emp : list) {
			total+=emp.sal;
		}
		double avg = total/list.size();
		List<Employee> list1 = new ArrayList<>();
		for(Employee emp : list) {
			double sal = emp.sal;
			if(sal > avg) {
				list1.add(emp);
			}
		}
		System.out.println(list);
//		Comparator<Employee> com = (o1,o2) -> {
//			return o1.id - o2.id;
//		};
//		Collections.sort(list1, com);
		Collections.sort(list1, (o1,o2) -> o1.name.compareTo(o2.name));
		System.out.println(list1);
	}

}
