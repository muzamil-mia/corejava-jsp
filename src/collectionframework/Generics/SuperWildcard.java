package collectionframework.Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SuperWildcard {

	public static void main(String[] args) {
		//here we cannot pass the collection of numbers to the append method below
		//As the append() method accepts a Collection<Integer>, it’s illegal to pass a List<Number>.
		//The extends wildcard cannot be used like this:
		//public static void append(Collection<? extends Integer> integers, int n)
		//since Number is of super type
		
		//So what if we want to restrict the elements being added in the method is of type Integer, whereas we also want to accept a collection of super types of Integer, since adding integers to a collection of numbers is perfectly legal?
		//In this case, the super wildcard is the solution. Let’s update signature of the append() method like this:
		List<Number> numbers = new ArrayList<Number>();
		append1(numbers, 5);
		numbers.add(6.789);
		 
		System.out.println(numbers);
	}
	
	
	
	public static void append(Collection<Integer> integers, int n) {
		for (int i = 1; i <= n; i++) {
	        integers.add(i);
	    }
	}

	public static void append1(Collection<? super Integer> integers, int n) {
	    for (int i = 1; i <= n; i++) {
	        integers.add(i);
	    }
	}
}
