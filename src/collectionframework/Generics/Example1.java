package collectionframework.Generics;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
	//Generics is the java programming feature which was introduced in java 1.5
	//generic was introduced to address the issue which was with the collection that is why it is also called as generics-collections
	
	
	public static void main(String[] args) {
		//lets see the problem which was there with the collection before generics
		List list = new ArrayList();
		list.add("sabit");
		list.add("muzamil");
		list.add(new Date(0)); 
		list.add(100);
		
		//Here, the cast to String is needed because the get() method returns an object of type Object.
		String name1 = (String) list.get(0);
		
		//problem 
		String date = (String) list.get(2); //no error at compile time but at run time it will throw ClassCastException
		System.out.println(date);
		//This assignment expects a String object on the right side, but the actual object returned is
		//a Date object. This problem cannot be detected at compile time by the compiler because
		//everything seems fine until that statement is executed at runtime, a ClassCastException will be thrown:
		
		//CODE WITH GENERICS
		List<String> listNames = new ArrayList<String>();
		listNames.add("Tom");
		listNames.add("Mary");
		listNames.add("Peter");
		String name2 = listNames.get(1);
		//listNames.add(new Date(0)); compile time error because list is supposed to take elements of parameterized type which is String here
	}
}
