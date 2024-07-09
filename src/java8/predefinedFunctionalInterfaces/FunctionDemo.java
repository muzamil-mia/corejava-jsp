package java8.predefinedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Double> hanlfValue = i -> i/2.0;
		
		//Req : given string should be converted touppercase
		//Function<String, String> functionToUpperCase = s -> s.toUpperCase();
		Function<String, String> functionToUpperCase = String::toUpperCase;
		System.out.println(functionToUpperCase.apply("hello world"));
		
		//Null check
		Function<String, String> func2nullCheck = str -> str == null ? "Enter valid value" : str;
		String result = func2nullCheck.andThen(functionToUpperCase).apply(null);
		System.out.println(result);
		String result2 = func2nullCheck.andThen(functionToUpperCase).apply("this is my name");
		System.out.println(result2);
		
		System.out.println("this is functionality of compose");
		result = func2nullCheck.compose(functionToUpperCase).apply("this is compose");
		System.out.println(result);
		//result2 = func2nullCheck.compose(functionToUpperCase).apply(null); //NullPointerException
		//System.out.println(result2);
		
		//static identity method
		Function<Integer, Integer> identicValue = Function.identity();
		System.out.println(identicValue.apply(100));
	}

}
