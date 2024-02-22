package collectionframework.listinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(true);
		list.add(new Corona(2000, 0.005));
		
		System.out.println(list);
		System.out.println(list.size());
		
		/**ArrayList all = new ArrayList();
		all.add("sambar");
		all.add("vada pav");
		all.add("chutney");
		list.add(all);
		System.out.println(list);
		System.out.println(list.size());
		list.addAll(all);
		System.out.println(list);
		System.out.println(list.size());
		*/
		
		list.add(5, "hello sambar");
		System.out.println(list);
		
	}

}
