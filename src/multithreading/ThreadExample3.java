package multithreading;

public class ThreadExample3 {

	public static void main(String[] args) {
		ThreadExample3 t = new ThreadExample3();
		Thread t1 = new Thread(() -> {
			int num = 2;
			for(int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + num*1);
			}
		});
	}
}
