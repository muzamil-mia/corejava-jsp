package collectionframework.set;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new TreeSetExample(2, "a", 98.7));
		ts.add(new TreeSetExample(3, "b", 70.5));
		ts.add(new TreeSetExample(1, "d", 80.5));
		System.out.println(ts);
	}
}
