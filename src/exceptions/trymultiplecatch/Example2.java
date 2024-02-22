package exceptions.trymultiplecatch;

public class Example2 {

	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			System.out.println(arr[10]);
		}catch(ArithmeticException obj) {
			System.out.println("arithmetic exception occurs");
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("ArrayIndexOutOfBounds exception occurs");
		}catch(Exception obj) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
	}

}
