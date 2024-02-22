package exceptions.throw1;

public class TestThrow1 {

	public static void main(String[] args) {
		try {
			//throw an object of user defined exception
			throw new UserDefinedException("this is user defined exception");
		}
		catch(UserDefinedException obj) {
			System.out.println("caught the exception");
			System.out.println(obj.getMessage());
		}
	}

}
