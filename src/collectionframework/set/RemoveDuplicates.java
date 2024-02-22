package collectionframework.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(5);
		HashSet<Integer> set = new HashSet<>();
		
		//Removing duplicates from array-list using for-each loop 
		for(Integer obj : list) {
			set.add(obj);
		}
//		System.out.println(set);
		
		//Set<Integer> set1 = new HashSet<>(list);
		//System.out.println(set1);
		
		//Set<Integer> set2 = new HashSet<>();
		
		
		//int[] arr = {5,3,8,3,6,7,5};
		//removing duplicates from array
//		for(int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
		System.out.println(set);
		List<Integer> list1 = new ArrayList<>(set);
		Collections.sort(list1);
		Collections.reverse(list1);
		System.out.println(list1);
		int n = 2;
		//System.out.println(set2.size()-n);
		//System.out.println(set2.size());
		int i = 0;
		
		//nth maximum for ascending order array
		for(Integer obj : set) {
			if(i == set.size() - n) {
				//System.out.println(i);
				System.out.println(obj);
			}
			i++;
		}
		
		//nth maximum for descending order array
		System.out.println(list1.get(n-1));
	}

}
