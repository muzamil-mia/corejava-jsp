package arrayproject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	static Scanner sc = new Scanner(System.in);
	static ArrayOperations obj = new ArrayOperations();
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("enter the element " + (i+1));
			arr[i] = sc.nextInt();
		}
		
		boolean exit = true;
		
		while(exit) {
			System.out.println("1: Insert");
			System.out.println("2: Insert All");
			System.out.println("3: Delete");
			System.out.println("4: Delete All");
			System.out.println("5: Update");
			System.out.println("6: Update All");
			System.out.println("7: Reverse");
			System.out.println("8: Find Maximum");
			System.out.println("9: Find Minimum");
			System.out.println("10: First Occurence");
			System.out.println("11: Last Occurence");
			System.out.println("12: First And Last Occurence");
			System.out.println("13: Sort Ascending");
			System.out.println("14: Sort Descending");
			System.out.println("15: Clear");
			System.out.println("16: Is Empty");
			System.out.println("17: Exit");
			System.out.println("18: Choose from above options");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("enter the element");
				int elem = sc.nextInt();
				System.out.println("enter the position");
				int pos = sc.nextInt();
				arr = obj.insert(arr, pos, elem);
				System.out.println(Arrays.toString(arr));
				break;
			case 2:
				System.out.println("enter the new array size");
				int length = sc.nextInt();
				int[] newArray = new int[size];
				for(int i = 0; i < length; i++) {
					System.out.println("enter the element " + (i+1));
					newArray[i] = sc.nextInt();
				}
				int[] resultantArray = new int[arr.length + newArray.length];
				resultantArray = obj.merge(arr, newArray);
				System.out.println(Arrays.toString(resultantArray));
				break;
			case 3:
				System.out.println("enter the element you want to delete");
				int dElem = sc.nextInt();
				arr = obj.delete(arr, dElem);
				System.out.println(Arrays.toString(arr));
				break;
			case 4:
				System.out.println("enter the element you want to delete");
				int dElement = sc.nextInt();
				arr = obj.deleteAll(arr, dElement);
			case 5:
				System.out.println("enter the old element");
				int old = sc.nextInt();
				System.out.println("enter the new element");
				int newElem = sc.nextInt();
				arr = obj.update(arr, old, newElem);
				System.out.println(Arrays.toString(arr));
				break;
			case 6:
				System.out.println("enter the old element");
				int old1 = sc.nextInt();
				System.out.println("enter the new element");
				int newElem1 = sc.nextInt();
				arr = obj.updateAll(arr, old1, newElem1);
				System.out.println(Arrays.toString(arr));
				break;
			case 7:
				arr = obj.reverse(arr);
				System.out.println(Arrays.toString(arr));
				break;
			case 8:
				int max = obj.findMax(arr);
				System.out.println(max);
				break;
			case 9: 
				int min = obj.findMin(arr);
				System.out.println(min);
				break;
			case 10:
				System.out.println("enter the element");
				int first = sc.nextInt();
				System.out.println("the elements first occurence is at index " + obj.firstOccurence(arr, first));
				break;
			case 11:
				System.out.println("enter the element");
				int last = sc.nextInt();
				System.out.println("the elements first occurence is at index " + obj.firstOccurence(arr, last));
				break;
			case 13:
				arr = obj.sort(arr);
				System.out.println(Arrays.toString(arr));
				break;
			case 15:
				arr= obj.clear();
				System.out.println(Arrays.toString(arr));
				break;
			case 16:
				boolean isEmpty = obj.isEmpty(arr);
				if(isEmpty) {
					System.out.println("array is empty");
				}
				break;
			case 17:
				//return;
				exit = false;
			}
			
		}
		
		/**int[] arr = {1,2,3,4,2,5};
		//int[] arr1 = {5,6,7,8};
		int pos = 3;
		int elem = 5;
		arr = obj.insert(arr, pos, elem);
		System.out.println(Arrays.toString(arr));
		arr=obj.deleteAll(arr, elem);
		System.out.println(Arrays.toString(arr));
		elem = 2;
		arr=obj.updateAll(arr, elem, 10);
		System.out.println(Arrays.toString(arr));
		int[] mergeArray = new int[arr.length + arr.length];
		mergeArray = obj.merge(arr, arr);
		System.out.println(Arrays.toString(mergeArray));
		int max = obj.findMax(arr);
	     System.out.println(max);
		int min = obj.findMin(arr);
		arr = obj.reverse(arr);
		System.out.println(Arrays.toString(arr));
		int firstOccurence = obj.firstOccurence(arr, elem);
		//System.out.println(firstOccurence);
		int lastOccurence = obj.lastOccurence(arr, elem);
		System.out.println(lastOccurence);
		arr = obj.clear();
		System.out.println(Arrays.toString(arr));
		boolean isEmpty = obj.isEmpty(arr);
		System.out.println(isEmpty);*/
	}
}
