package arrays.singleDarray;

public class SwapAdjacentPair {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i < arr.length-1; i++) {
			if(i % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = temp;
			}
		}
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
	}

}
