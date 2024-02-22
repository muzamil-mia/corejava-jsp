package exceptions.nestedtrycatch;

public class Example1 {

	public static void main(String[] args) {
		try {
			//int b = 30/0;  //scenario
			//inner try block 1
			try {
				System.out.println("going to divide by zero");
				int a = 30/0;
			}
			//catch block for inner try block 1
			catch(ArithmeticException obj) {
				System.out.println("ArithmeticException occurs");
			}
			
			//inner try block 2
			try {
				int[] a = new int[5];
				//assigning the value out of array bounds
				a[5] = 4;
			}
			//catch block for inner try block 2
			catch(ArrayIndexOutOfBoundsException obj) {
				System.out.println(obj);
			}
			System.out.println("other statements");
			//int b = 30/0; //scenario
		}
		//catch for outer block
		catch(Exception obj) {
			System.out.println("handled the exceptio outer catch");
		}
	}

}
