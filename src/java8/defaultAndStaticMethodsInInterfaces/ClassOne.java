package java8.defaultAndStaticMethodsInInterfaces;

public class ClassOne implements InterfaceOne {

	@Override
	public void printNames() {
		System.out.println("print names method from implemented class one of interface one");
	}

	@Override
	public void getNames() {
		//calling default methods from class level methods
		defaultMethodOne();
		System.out.println("get names method from implemented class one of interface one");
	}
	
	//overriding the default method in our implemented class
	//@Override
	public void defaultMethodOne() {
		System.out.println("overriden default method from the implemented class");
	}

}
