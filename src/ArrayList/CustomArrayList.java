package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
	
	private int[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0; //also works as index value
	
	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	public void add(int num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	@Override
	public String toString() {
		return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
	}
	public void set(int index, int value) {
		data[index] = value;
	}
	
	public int size() {
		return size;
	}

	public int get(int index) {
		return data[index];
	}
	private void resize() {
		int[] temp = new int[data.length * 2];
		
		//copy the current items in the new array
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	private boolean isFull() {
		return size == data.length;
	}
	
	

	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		for(int i = 0; i < 14; i++) {
			list.add(2 * i);
		}
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		//Integer a = new Integer(); cannot create instance of type parameters
	}

}
