package exceptions.trymultiplecatch;

public class Example3 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		}catch(ArithmeticException obj) {
			System.out.println("arithmetic exception occurs");
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}catch(Exception obj) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
	}

}
