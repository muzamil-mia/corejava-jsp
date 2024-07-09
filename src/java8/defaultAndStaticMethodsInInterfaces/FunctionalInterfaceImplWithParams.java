package java8.defaultAndStaticMethodsInInterfaces;

public class FunctionalInterfaceImplWithParams {

	public static void main(String[] args) {
		
		CalciOperation addition = (int x, int y) -> {
			
			System.out.println("values are: " + x + ", " + y);
			return x + y;
			
		};
		//executing lambda expression
		double result = addition.operation(10, 30);
		
		//second lambda expression for same functional interface
		CalciOperation subtraction = (p, q) -> { //data type mention is also not required
			
			return p - q;
		};
		
		double sub = subtraction.operation(90, 30);
		System.out.println(sub);
		System.out.println(subtraction);
		
		//third lambda expression 
		CalciOperation multiplication = (p, q) -> p*q;
		System.out.println(multiplication.operation(10, 10)); //return type also optional
		multiplication.printInfo();
		CalciOperation.typeOfOperation();
	}

}
