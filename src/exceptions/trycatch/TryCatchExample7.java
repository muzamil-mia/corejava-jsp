package exceptions.trycatch;

public class TryCatchExample7 {

	public static void main(String[] args) {
		try {
			int data = 50 / 0;
		} catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
		}
		System.out.println("after handling the exception");
	}
}
