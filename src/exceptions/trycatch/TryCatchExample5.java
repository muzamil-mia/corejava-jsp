package exceptions.trycatch;

public class TryCatchExample5 {

	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			data = i/j;
		}catch (Exception e) {
			//resolving the exception
			System.out.println(i/(j+2));
			System.out.println("exception resolved");
		}
	}

}
