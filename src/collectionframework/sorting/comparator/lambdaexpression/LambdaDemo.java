package collectionframework.sorting.comparator.lambdaexpression;

interface A {
	void show();
}

//the whole purpose of bellow class is to implement A no other purpose other than this
//and we are using this class only once
//so if we have this scenario where we are using the class only once then why to even create that class
//

// class ImplementingA implements A {
//
//	@Override
//	public void show() {
//		System.out.println("showing");
//	}
//}

public class LambdaDemo {
	public static void main(String[] args) {
		A obj;
		//obj = new ImplementingA();
		//obj.show();
		//obj = new A();  -> cannot instantiate the A since its an interface and does not have
		//implementation
		//what if we provide the implementation here itself like below
		
		/**
		 * obj = new A() 
		 *anonymous class a class without a name here we are not creating the object of A interface
		 *instead we are creating the object of anonymous class which is implementing the A interface
		 *and storing the object reference of anonymous class in up-casted format
		 * {

			@Override
			//providing the implementation here itself
			public void show() {
				System.out.println("showing");
			}
		};
		*/
		
		//with lambda expression
		obj = () -> {
			System.out.println("showing");
		};
		obj.show();
	}
}
