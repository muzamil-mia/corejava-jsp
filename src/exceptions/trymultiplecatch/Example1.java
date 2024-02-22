package exceptions.trymultiplecatch;

public class Example1 {

	public static void main(String[] args) {
		try {
			int a = 30/0;
		}catch(ArithmeticException obj) {
			System.out.println("cannot divide by zero");
		}catch(ArrayIndexOutOfBoundsException obj) {
		    System.out.println("array index out of bounds exception");
		}catch(Exception obj) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
	}

}
