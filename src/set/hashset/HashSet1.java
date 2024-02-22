package set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSet1 {

	public static void main(String[] args) {
		//creating set
		Set<String> set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//four, one, two, three
			
		}
	}

}
