import java.util.Arrays;

public class BinarySearch1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = {2,10,3,4,9,5,6,20,34,8};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		boolean elementFound = findElement(arr);
		System.out.print(elementFound);
	}
	private static boolean findElement(int[] newArr) {
		int target = 8, f = 0,  l = newArr.length-1;
		while(f<=l) {
			int mid =(l+f) /2;
//			System.out.print(mid);
			if(newArr[mid] == target) {
//				System.out.println("element found at index " + mid);
				return true;
			}if(target > newArr[mid]) {
				f = mid+1;
			}else  {
				l= mid-1;
			}
		}
		return false;
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}

}
