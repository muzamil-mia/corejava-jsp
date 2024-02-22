package exceptions.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		try {
			int data = 50 / 0;
		} catch(ArithmeticException obj) {
			System.out.println(obj);
		}
		System.out.println("after handling the exception i got printed");
	}

}
