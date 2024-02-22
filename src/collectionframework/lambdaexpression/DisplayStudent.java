package collectionframework.lambdaexpression;

public class DisplayStudent {

	public static void main(String[] args) {
		Demo stu = (String name, double marks) -> {
			return "My name is and" + name + "\ni have scored " + marks;
		};
		System.out.println(stu.disp("muzamil", 98));
		
	}

}
