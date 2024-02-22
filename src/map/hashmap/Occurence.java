package map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Occurence {

	public static void main(String[] args) {
		String str = "helloworld";
		HashMap<Character, Integer> hs = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(hs.containsKey(ch)) {
//				if(hs.get(ch) < 1)
				hs.put(ch, hs.get(ch)+1);
			}else {
				hs.put(ch, 1);
			}
		}
		System.out.println("occurence");
		System.out.println(hs);
		System.out.println("**********************");
		System.out.println("unique characters");
		Set<Character> keys = hs.keySet();
		for(Character i : keys) {
			int occ = hs.get(i);
			if(occ == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("*************************");
		System.out.println("Duplicates");
		for(Character i : keys) {
			int occ = hs.get(i);
			if(occ > 1) {
				System.out.print(i + " ");
			}
		}
	}

}
