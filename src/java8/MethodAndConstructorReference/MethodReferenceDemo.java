package java8.MethodAndConstructorReference;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		ConvertToUpperCase uppercase = (value) -> {
			System.out.println("inside lambda notation converting to upercase");
			return value.toUpperCase();
		};
		
		System.out.println(uppercase.toUppserCase("java method reference"));
		
		//method reference
		ConvertToUpperCase upperCaseTwo = String::toUpperCase;
		System.out.println(upperCaseTwo.toUppserCase("java method reference"));
	}

}
