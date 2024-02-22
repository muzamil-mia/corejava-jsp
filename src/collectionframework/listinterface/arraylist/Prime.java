package collectionframework.listinterface.arraylist;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(8);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(0);
		list.add(3);
		//System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			if(prime(list.get(i))) {
				System.out.println(list.get(i));
			}
		}
	}

	private static boolean prime(Integer num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
