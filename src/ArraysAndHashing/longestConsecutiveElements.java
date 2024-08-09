package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveElements {

	public static void main(String[] args) {
		int arr[] = {100,4,200,1,3,2};
		int result = longestConsecutive(arr);
		System.out.println(result);
	}

	private static int longestConsecutive(int[] nums) {
		if(nums.length==0) {
		 	return 0;
		}
		int max=1;
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < nums.length ; i++) {
			if(!set.contains(nums[i])) {
				set.add(nums[i]);
			}
		}
		for(Integer i : set) {
			if(!set.contains(i-1)) {
				int localMax= 1;
				int nextVal= i+1;
				while(true) {
					if(set.contains(nextVal)) {
						localMax++;
						nextVal++;
						if(localMax>max) {
							max = localMax;
						}
					}
					else break;
				}
			}
		}
		
		return max;
	}

}
