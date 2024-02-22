package arrays.singleDarray;

public class RightShift {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int  n = 3;
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[n++];
			if(n == arr.length) {
				n = 0;
			}
		}
		for(int i : newArr) {
			System.out.print(i + " ");
		}
	}

}
