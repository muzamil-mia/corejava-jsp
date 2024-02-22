package arrays.singleDarray;

public class PrintFibNotFib {

	public static void main(String[] args) {
		int[] arr = {5,3,6,4,8,0,1,7,2,9};
		int[] newArr = new int[arr.length];
		
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(!(fibo(arr[i]))) {
				newArr[j++] = arr[i];
				
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(fibo(arr[i])) {
				newArr[j++] = arr[i];
				
			}
		}
		for(int element : newArr) {
			System.out.print(element + " ");
		}
	}

	private static boolean fibo(int n) {
		int n1 = 0, n2 =1, n3 = n1 + n2;
		if (n == 0) {
			return true;
		}
		while(n3 < n) {
			if(n == n3) {
				return true;
			}
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
		return false;
		
	}

}
