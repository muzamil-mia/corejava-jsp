package exceptions.customexceptions;

public class TestCustomeException1 {
	
	public static void validate(int age) throws InvalidAgeException {
		if(age < 18) {
			
			//throw an object of user defined exception
			throw new InvalidAgeException("age is not valid");
		}
	}

	public static void main(String[] args) {
		try {
			//calling the method
			validate(13);
		} catch(InvalidAgeException ex) {
			System.out.println("caught exception");
			
			//printing the message from InvalidException object
			System.out.println("exception occured " + ex);
		}
		System.out.println("rest of the code");
	}
}
