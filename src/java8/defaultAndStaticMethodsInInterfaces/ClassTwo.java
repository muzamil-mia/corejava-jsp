package java8.defaultAndStaticMethodsInInterfaces;

public class ClassTwo implements InterfaceOne, InterfaceTwo {

	@Override
	public void printNames() {
		System.out.println("print names method from implemented class three for interface one and interface two");
	}

	@Override
	public void getNames() {
		//calling default methods from class level methods
		defaultMethodOne();
		System.out.println("get names method from implemented class three for interface one and interface two");
	}

	@Override
	public void sameMethod() {
		// TODO Auto-generated method stub
		InterfaceOne.super.sameMethod();
		InterfaceTwo.super.sameMethod();
	}

	

}
