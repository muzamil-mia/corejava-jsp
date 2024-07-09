package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3,4};
		findFrequency(arr);
		char[] charArray = {'a', 'b', 'c', 'a', 'b', 'z'};
		String str = "abcabx";
		findFrequencyOfCharacters(str);
		
	}

	private static void findFrequencyOfCharacters(String str) {
		int hashArray[] = new int[26];
		for(int i = 0; i < str.length(); i++) {
			int value = str.charAt(i) - 'a';
			hashArray[value] += 1;
		}
		
		
		for(int i = 0; i < hashArray.length; i++) {
			if(hashArray[i] != 0) {
				System.out.println("character " + (char)( i + 'a') + " appears " + hashArray[i] + " number of times");
			}
		}
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		System.out.println("======using map========");
		for(int i = 0; i < str.length(); i++) {
			int element = str.charAt(i) - 'a';
			int value = frequencyMap.getOrDefault(element,0);
			frequencyMap.put(element, value+1);
			hashArray[element] += 1;
		}
		Set<Integer> set = frequencyMap.keySet();
		for(int key : set) {
			System.out.println("element " + (char) (key + 'a') + " occurs " + frequencyMap.get(key) + " number of times");
		}
		
	}

	private static void findFrequency(int[] arr) {
		int hashArray[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int element = arr[i];
			hashArray[element] += 1;
		}
		for(int i = 0; i < hashArray.length; i++) {
			if(hashArray[i] != 0) {
				System.out.println("element " + i + " appears " + hashArray[i] + " number of times");
			}
		}
		
	}
}
