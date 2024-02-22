package set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("ravi");
		set.add("vijay");
		set.add("ravi");
		set.add("rahul");

		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
