package ArrayList;

import java.util.Arrays;

public class WildCardExample<T extends Number> {
	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;
	
	public WildCardExample() {
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
		WildCardExample<Integer> list = new WildCardExample<>();
		WildCardExample list4 = new WildCardExample(); 
		list4.add(10);
		//list4.add("hello");
		
		WildCardExample<Long> list2 = new WildCardExample();
		
		//WildCardExample<String> list3 = new WildCardExample(); error not possibel because T extends Number
	}

}
