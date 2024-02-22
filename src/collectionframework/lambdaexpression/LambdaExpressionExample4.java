package collectionframework.lambdaexpression;

public class LambdaExpressionExample4 {
	interface Addable {
		int add(int a, int b);
	}

	public static void main(String[] args) {
		// multiple parameters in lambda expression
		Addable add1 = (a, b) -> (a + b);
		System.out.println(add1.add(10, 20));

		// multiple parameters with data type in lambda expression
		//with return type 
		Addable add2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(add2.add(30, 50));
	}

}
