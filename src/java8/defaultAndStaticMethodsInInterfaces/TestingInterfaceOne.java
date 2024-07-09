package java8.defaultAndStaticMethodsInInterfaces;

public class TestingInterfaceOne {
	public static void main(String[] args) {
		ClassOne classOne = new ClassOne();
		classOne.defaultMethodOne();
		classOne.defaultMethodTwo();
		
		ClassTwo classTwo = new ClassTwo();
		classTwo.break1();
		classTwo.defaultMethodOne();
		classTwo.sameMethod(); 
	}
}
