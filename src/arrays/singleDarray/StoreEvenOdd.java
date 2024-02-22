package arrays.singleDarray;

public class StoreEvenOdd {

	public static void main(String[] args) {
		int[] arr = {2,7,5,8,9,6,18,12};
		int[] newArr = new int[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				newArr[j++] = arr[i];
			}
		}
		for(int i : arr) {
			if(i % 2 != 0) {
				newArr[j++] = i;
			}
		}
		for(int element : newArr) {
			System.out.print(element + " ");
		}
	}

}
