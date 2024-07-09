package java8.optionalClass;

import java.util.Optional;

public class UpperCaseValue2 {

	public static void main(String[] args) {
		
		Optional<String> nameContainer = getName1();
		if(nameContainer.isPresent()) {
			String nameValue = nameContainer.get();
			System.out.println(nameValue.toUpperCase());
		}else {
			System.out.println("the value is not available");
		}
		
			
	}

	private static Optional<String> getName1() {
		String name = null;
		Optional<String> value;
		if(name == null) {
			value = Optional.empty();
		}else {
			 value = Optional.of(name);
		}
		
		return value;
	}

}
