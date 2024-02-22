package collectionframework.listinterface;
import java.util.ArrayList;
import java.util.ListIterator;
public class EvenObjects {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(12);
		
		ListIterator<Integer> itr1 = list.listIterator();
		while(itr1.hasNext()) {
			int element = itr1.next();
			if(even(element)) {
				System.out.print(element + " ");
			}
		}
	}

	private static boolean even(Integer next) {
		if(next % 2 == 0) {
			return true;
		}
		return false;
	}
}
