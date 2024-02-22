package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Example1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		/**list.add(67);
		list.add(99);
		list.add(10);
		list.add(100);
		list.add(12);
		System.out.println(list);
		System.out.println(list.contains(10000));
		list.remove(2);
		System.out.println(list);
		list.set(3,100);
		System.out.println(list);*/
		for(int i = 0; i < 3; i++) {
			list.add(sc.nextInt());
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list);
	}

}
