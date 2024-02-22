package collectionframework.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		Iterator itr1 = list.listIterator();
	}

}
