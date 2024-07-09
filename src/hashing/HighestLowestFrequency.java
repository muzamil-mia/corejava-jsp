package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HighestLowestFrequency {

	public static void main(String[] args) {
		int nums[] = {10,5,10,15,10,5};
		int n = nums.length;
		countFrequency(nums, n);
		
		//optimal logic using map
		countFrequency1(nums, n);
	}

	private static void countFrequency1(int[] nums, int n) {
		System.out.println("===========using map==============");
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
		
		int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;  
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
		System.out.println(maxEle + " occurs " + maxFreq + " number of times");
		System.out.println(minEle + " occurs " + minFreq + " number of times");
        }
	}

	private static void countFrequency(int[] nums, int n) {
		System.out.println("===============using brute force================");
		boolean[] visited = new boolean[n];
		int maxElement = 0, minElement = 0, maxFreq = 0, minFreq = n;
		for(int i = 0; i < n; i++) {
			if(visited[i] == true)
				continue;
			int count = 1;
			for(int j = i + 1; j < n; j++) {
				if(nums[j] == nums[i]) {
					visited[j] = true;
					count++;
				}
			}
			if(count >  maxFreq) {
				maxFreq = count;
				maxElement = nums[i];
			}
			
			if(count < minFreq) {
				minFreq = count;
				minElement = nums[i];
			}
		}
		System.out.println(maxElement + " occurs " + maxFreq + " number of times");
		System.out.println(minElement + " occurs " + minFreq + " number of times");
	}
}
