 package collectionframework.listinterface.arraylist;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeUser {
	public static void main(String[] args) {
		double sal = 0.0;
		double totalSal = 0.0;
		
		ArrayList<Object> list = new ArrayList<>();
		Employee e1 = new Employee("Muzamil", 1, 20000, "Software Developer");
		Employee e2 = new Employee("Sabit", 2, 30000, "backend developer");
		Employee e3 = new Employee("zahid", 3, 30000, "salesforce developer");
		Employee e4 = new Employee("varun", 4, 20000, "frontend developer");
		Employee e5 = new Employee("aqib", 5, 22000, "react developer");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println(list);
		ArrayList<Employee> emp1 = new ArrayList<>();
		//printing using for loop
		for(int i = 0; i < list.size(); i++) {
			//Employee obj1 = (Employee)list.get(i);
			Employee obj = (Employee)list.get(i);
			System.out.print("Name: " + obj.name + " ");
			String name = obj.name;
			//if(name.charAt(0) == 'a');
			char ch = name.charAt(0);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				emp1.add(e4);
			}
			sal = obj.sal;
			totalSal += sal;
		}
		System.out.println();
		double avgSal = totalSal/list.size()-1;
		System.out.println("Average salary is: " + avgSal);
		System.out.println("employees whose name starts with vowel letter: " + emp1);
		
		ArrayList<Employee> emp = new ArrayList<>();
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Employee obj = (Employee)itr.next();
			if(obj.sal > avgSal) {
				emp.add(obj);
			}
		}
		System.out.println("Employess who have salary greater than average salary: " + emp);
	}
}
