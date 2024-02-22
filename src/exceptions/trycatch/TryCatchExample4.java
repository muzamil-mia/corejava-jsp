package exceptions.trycatch;

public class TryCatchExample4 {

	public static void main(String[] args) {
		try {
			int data = 50 / 0;
		} catch (Exception obj) {
			System.out.println(obj);
			System.out.println("handling the exception using parent class exception");
		}
		System.out.println("rest of the code");
	}

}
