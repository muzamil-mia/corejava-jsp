package java8.optionalClass;

import java.util.Optional;

public class UpperCase3 {

	public static void main(String[] args) {

		Optional<String> nameContainer = getName1();

		// ifPresent()
		nameContainer.ifPresent(val -> {
			// logic
			System.out.println(val.toUpperCase());
		});

		// ifPresentOrElse()
//		nameContainer.ifPresentOrElse(
//
//				// ist param: when value is present
//				(val) -> {
//					System.out.println("value present converting to uppercase");
//					System.out.println(val.toUpperCase());
//				},
//
//				// 2nd param: when value is not there
//				() -> {
//					System.out.println("value is not present");
//				});

	}

	private static Optional<String> getName1() {
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
