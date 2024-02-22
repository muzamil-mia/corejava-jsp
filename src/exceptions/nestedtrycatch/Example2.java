package exceptions.nestedtrycatch;

public class Example2 {

	public static void main(String[] args) {
		try {
			//inner block 1
			try {
				//inner block 2
				try {
					int[] arr = {1,2,3,4};
					System.out.println(arr[10]);
				}
				//to handle Arithmetic Exception
				catch(ArithmeticException obj) {
					System.out.println("ArithmeticExcepton occurs");
					System.out.println("inner try block 2");
				}
			}
			// to handle ArithmeticException
			catch(ArithmeticException obj) {
				System.out.println("ArithmeticException occurs");
				System.out.println("inner try block 1");
			}
		}
		//to handle ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
			System.out.println("outer (main) try block");
		}
		catch (Exception e5) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
	}

}
