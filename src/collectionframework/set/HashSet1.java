package collectionframework.set;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("muzamil");
		set.add("sabit");
		set.add("sabit");
		boolean isadded = set.add("sabit");
		boolean isAdded = set.add("Muzamilmia");
		System.out.println(isAdded + " adding Muzamilmia");
		System.out.println(isadded + " adding mia");
		System.out.println(set);
		HashSet<String> set1 = new HashSet<>(set);
	}
}
