package collectionframework.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExtendsWildCard {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 4, 6);
		//double sum = sum(integers); CTE
		//with this method signature, we can only pass List<Number>, not List<Double> nor List<Integer>.
		//If we attempt to call this method by passing a list of integers like this:
		
		sum1(integers);
		List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
		double sum = sum1(doubles);
		System.out.println("Sum of doubles = " + sum);
		 
		List<Number> numbers = Arrays.asList(2, 4, 6, 3.14, 1.68, 2.94);
		sum = sum1(numbers);
		System.out.println("Sum of numbers = " + sum);
		
		//this is not possible
		List<? extends Number> numbers1 = new ArrayList<Integer>();
		//numbers1.add(123);   // COMPILE ERROR
		//nu,bers1.add(null)   //OK
	}
	
	
	public static double sum(Collection<Number> numbers) {
	    double result = 0.0;
	 
	    for (Number num : numbers) result += num.doubleValue();
	 
	    return result;
	}
	
	//solution
	private static double sum1(Collection<? extends Number> numbers) {
	    double result = 0.0;
	 
	    for (Number num : numbers) result += num.doubleValue();
	 
	    return result;
	}
	

}
