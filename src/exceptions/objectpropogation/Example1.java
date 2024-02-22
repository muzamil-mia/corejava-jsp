package exceptions.objectpropogation;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Example1 {

	public static void main(String[] args) throws FileNotFoundException {
		run();
	}
	public static void run() throws FileNotFoundException {
		walk();
	}
	
	public static void walk() throws FileNotFoundException {
		new FileOutputStream("c://geca22/p1.txt");
	}
}
