package collectionframework.lambdaexpression;

interface Sayable{
	public String say();
}

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		Sayable s = () -> {
			return "i have nothing to say";
		};
		System.out.println(s.say());
	}

}
