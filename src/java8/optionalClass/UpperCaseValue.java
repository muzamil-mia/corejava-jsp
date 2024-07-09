package java8.optionalClass;

import java.util.Optional;

public class UpperCaseValue {

	public static void main(String[] args) {
		String name = getName();
		
		//name.toUpperCase();
		//System.out.println(name);
		
		//to avoid NullPointerException we can use conditional check
		if(name != null) {
			name = name.toUpperCase();
			System.out.println(name);
		}
		
		//to avoid the problem of NullPointerException Optional Class was introduced in java8
		Optional<String> nameContainer = getName1();
		if(nameContainer.isPresent()) {
			String nameValue = nameContainer.get();
			System.out.println(nameValue.toUpperCase());
		}
	}

	
	private static Optional<String> getName1() {
		
		Optional<String> value = Optional.of("hello java");
		return value;
	}


	private static String getName() {
		//return "abc"; //ABC
		return null;   //NullPointerException
	}

}
