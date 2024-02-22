package set.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ravi");
		list.add("raj");
		list.add("kumar");
		list.add("ravi");
		System.out.println(list);
		
		HashSet<String> set = new HashSet<>(list);
		System.out.println(set);
	}

}
