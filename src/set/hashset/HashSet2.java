package set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		//ignoring duplicate elements
		HashSet<String> set = new HashSet<>();
		set.add("muzamil");
		set.add("hussain");
		set.add("sabit");
		set.add("muzamil");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//hussain, muzamil, sabit
		}
	}

}
