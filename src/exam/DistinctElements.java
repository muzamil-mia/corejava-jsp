package exam;

import java.util.Arrays;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,6,4,2,3,5,3};
		int[] newArr = new int[arr.length];
		int visited = -1, count1 = 0, count2 = 0;
		for(int i = 0; i< arr.length-1; i++) {
			int count = 1;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					count++;
					newArr[j] = visited;
				}
			}
			if(newArr[i] != visited) {
				newArr[i] = arr[i];
			}
		}
//		for(int i = 0; i < newArr.length; i++) {
//			if(newArr[i] != visited) {
//				System.out.print(newArr[i] + " ");
//			}
//			
//		}
		
		for(int i = 0; i < newArr.length-1; i++) {
			int min = i;
			for(int j = i + 1; j < newArr.length; j++) {
				if(newArr[min] > newArr[j]) {
					min = j;
				}
			}
			int temp = newArr[min];
			newArr[min] = newArr[i];
			newArr[i] = temp;
		}
		for(int i = 0; i < newArr.length; i++) {
			if(newArr[i] != visited) {
				//System.out.print(newArr[i] + " ");
				count2++;
			}
		}
		int[] sortedArr = new int[count2];
		for(int i = 0, j = 0; i < newArr.length; i++) {
			if(newArr[i] != visited) {
				sortedArr[j++] = newArr[i];
			}
		}
		System.out.println(Arrays.toString(sortedArr));
	  }
	}