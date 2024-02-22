package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {
	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;
	
	public CustomGenArrayList() {
		data = new Object[DEFAULT_SIZE];
	}
	
	public  void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	public <T> T remove() {
		T removed = (T) data[--size];
		return removed;
	}
	
	private void resize() {
		Object[] temp = new Object[data.length*2];
		
		//copy the current items in the new array
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
	

	@Override
	public String toString() {
		return "CustomGenArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}

	private boolean isFull() {
		
		return size == data.length;
	}

	public static void main(String[] args) {
		CustomGenArrayList list = new CustomGenArrayList();
		list.add(3);
		list.add(5);
		list.add(9);
		list.add("hello");
		System.out.println(list);
		CustomGenArrayList<Integer> list1 = new CustomGenArrayList<Integer>();
		list1.add(10);
		list1.add(12);
		//list1.add("hello");  compilation error
		System.out.println(list1);
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		
		
	}
}
