package collectionframework.listinterface.arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
public class Example1 {

	public static void main(String[] args) {
		Collection obj;
		
		List obj1;
		
	
		ArrayList list = new ArrayList();
		//adding object in arraylist
		list.add("ravi");
		list.add("tavi");
		list.add("manvi");
		list.add("palavi");
		
		ArrayList list1 = new ArrayList(list);
		ArrayList list2 = new ArrayList(4);
		
		//traversing list through iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
