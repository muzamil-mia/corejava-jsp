package collectionframework.sorting.comparator.lambdaexpression;

interface B {
	void sum(int a, int b);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		B obj;
//		obj = new B() {
//			@Override
//			public void sum(int a, int b) {
//				System.out.println(a+b);
//			}
//		};
//		obj.sum(10,20);
		obj = (int a, int b) -> System.out.println(a+b);
		obj.sum(10,20);
	}
}
