package set.treeset;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(8);
		set.add(9);
		System.out.println(set.ceiling(4));
		System.out.println(set.floor(7));
		System.out.println(set.higher(5));
		System.out.println(set.higher(9));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);
	}

}
