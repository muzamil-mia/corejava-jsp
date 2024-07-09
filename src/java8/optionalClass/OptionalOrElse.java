package java8.optionalClass;

import java.util.Optional;

public class OptionalOrElse {

	public static void main(String[] args) {
		
		Optional<String> nameContainer = getName();
		
		//or()
		//if value is present, returns same Optional object
		//if value is not present
		//then supplier functionality will produce another optional with value.
		
//		String result = nameContainer.or(() -> {
//			return Optional.of("java developer");
//		}).get();
//		
//		System.out.println(result);
	}

	
	private static Optional<String> getName() {
		String name = "name";
		Optional<String> value;
		if (name == null) {
			value = Optional.empty();
		} else {
			value = Optional.of(name);
		}

		return value;
	}
	
}
