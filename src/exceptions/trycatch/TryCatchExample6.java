package exceptions.trycatch;

public class TryCatchExample6 {
	public static void main(String[] args) {
		
		try {
			int data = 50 / 0; // may throw an exception
		} catch (Exception e) {
			int data1 = 50 / 0; //may throw an exception
		}
		System.out.println("rest of the code");
	}
}
