package collectionframework.lambdaexpression;

interface Message {
	public String say(String name);
}

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		Message s = (name) -> {
			return "hello " + name;
		};
		System.out.println(s.say("muzamil"));
	}

}
