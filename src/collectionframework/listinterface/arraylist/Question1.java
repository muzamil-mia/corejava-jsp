package collectionframework.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Question1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("c#");
		list.add("python");
		list.add("javascript");
		list.add("java");
		list.add(5);
		list.add("GoLang");
		Collection obj;
		List obj1;
		
		
		System.out.println(list);
		
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
			Object ob = itr.next();
			int index = itr.nextIndex();
			if(index == 1) {
				itr.add("c++");
			}else if(ob.equals("javascript")) {
				itr.set("php");
			}else if(ob.equals(5)) {
				itr.remove();
			}
		}
		System.out.println(list);

	}

}
