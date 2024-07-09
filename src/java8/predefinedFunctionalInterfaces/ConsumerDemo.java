package java8.predefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		//List of value : names : abc, xyz, PQR, MNo
		//print all in upper case
		
		List<String> names = Arrays.asList("xyz", "MNo", "pqR");
		
		Consumer<String> printInUpperCase = str -> System.out.println(str.toUpperCase());
		printInUpperCase.accept("muzamil");
		
		names.forEach(printInUpperCase);
		
		List<String> newValues = new ArrayList<String>();
		
		Consumer<String> addToList = str -> newValues.add(str.toUpperCase());
		names.forEach(addToList);
		
		System.out.println(newValues);

	}
}
