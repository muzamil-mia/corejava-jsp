package exceptions.finally1;

public class Example2 {

	public static void main(String[] args) {
		try {
			int data = 25 / 0;
		}
		catch(NullPointerException obj) {
			System.out.println(obj);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
