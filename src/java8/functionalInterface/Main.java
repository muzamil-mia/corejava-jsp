package java8.functionalInterface;

public class Main {

	public static void main(String[] args) {
		
		//Interface can refer impl. class Instance
		Calculate calc = new Operation();
		calc.calculating();
		
		//Lambda Expression
		Calculate calc1 = () -> {
			System.out.println("calculating for lambda expression");
		};
		calc1.calculating();
	}

}
