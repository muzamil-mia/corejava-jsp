package polymorphism.finalkeyword;

public class LocalFinalVariable {

	public static void main(String[] args) {
		/** SCENARIO ONE
		  final int n = 10;
		n = 100;  //CTE n cannot be reinitialized as n is final  */
		
		/** SCENARION TWO: This scenario is valid the first initialized value will be considered as final but cannot be reinitialized
		  final int n;  //called blank final variable
		n = 100;  //valid
		n= 1000; //invalid
		 */
		final int i;
		run(i = 10);
		//System.out.println(i);

	}
	
	public static void run(final int i) {
		//i = 20;
		System.out.println(i);
	}

}
