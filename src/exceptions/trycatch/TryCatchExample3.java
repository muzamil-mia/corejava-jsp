package exceptions.trycatch;

public class TryCatchExample3 {

	public static void main(String[] args) {
		try {
			//int data = 50 / 0;
			System.out.println("exception not occured initally");
			int data = 50/0;
			// if exception occurs, the remaining statement will not exceute  
			System.out.println("exception occured later");
		} catch(ArithmeticException obj) {
			System.out.println(obj);
			System.out.println("after obj");
		}
		System.out.println("after the exception is handled");
	}

}
