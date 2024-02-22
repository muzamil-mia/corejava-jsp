package arrays.singleDarray;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,};
		int[] newArr = new int[arr.length];
		
//		for(int i = 0; i < arr.length; i++) {
//			newArr[i] = arr[i];
//		}
		
		System.arraycopy(arr,0,newArr,0,arr.length);
		System.out.print("[");
		for(int element : newArr) {
			System.out.print(element + " ");
		}
		System.out.print("]");

	}

}
