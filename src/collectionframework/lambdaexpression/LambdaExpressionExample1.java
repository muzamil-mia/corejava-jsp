package collectionframework.lambdaexpression;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		int width = 10;
		/**without lambda expression
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Darawing " + width);
			}
		};
		d.draw();
		*/
		
		/**with lambda expression*/
		Drawable d = () -> {
			System.out.println("Drwaing "+ width);
		};
		d.draw();
	}

}


