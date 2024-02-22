package collectionframework.sorting.comparator.lambdaexpression;

import java.util.ArrayList;


  

public class Employe1User {

	public static void main(String[] args) {
		ArrayList<Employe1> list = new ArrayList<>();
		list.add(new Employe1(1,"a", 20000, "03-06-21"));
		list.add(new Employe1(2,"b", 25000, "01-03-21"));
		list.add(new Employe1(3,"c", 10000, "04-07-22"));
		list.add(new Employe1(4,"d", 30000, "01-03-21"));
		list.add(new Employe1(5,"e", 28000, "03-02-21"));
		for(Employe1 emp : list) {
//			String joiningDate = emp.jd;
//			//System.out.println(joiningDate);
//			String str1 = joiningDate.substring(3,5);
//			String str2 = joiningDate.substring(6);
		int month1 = Integer.parseInt(emp.jd.substring(3,5));
		int year1 = Integer.parseInt(emp.jd.substring(6));
//			int month = Integer.parseInt(str1);
//			//System.out.println(month);
//			int year = Integer.parseInt(str2);
//			//System.out.println(year);
			if(year1 < 22 || (year1 == 22 && month1 < 6)) {
				emp.sal = emp.sal + emp.sal*0.15;
			}
			//System.out.println(emp);
		}
//		System.out.println(list);
//		list.forEach(i -> {
//			System.out.println(i);
//		});
	}
}
