package collectionframework.set;

import java.util.HashSet;
import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs1 = new HashSet();
		HashSet hs2 = new HashSet();
		System.out.println("enter the size of set a");
		int a = sc.nextInt();
		System.out.println("enter the size of set b");
		int b = sc.nextInt();
		System.out.println("enter the elements of set a");
		for(int i = 0; i < a; i++) {
			hs1.add(sc.nextInt());
		}
		
		System.out.println("enter the elements of set b");
		for(int i = 0; i < b; i++) {
			hs2.add(sc.nextInt());
		}
		System.out.println(hs1);
		System.out.println(hs2);
		
		System.out.println("intersection");
		hs2.retainAll(hs1);
		System.out.println(hs2);
		
		System.out.println("union");
		hs2.addAll(hs1);
		System.out.println(hs2);
		
		System.out.println("difference");
		hs2.removeAll(hs1);
		System.out.println(hs2);
	}

}
