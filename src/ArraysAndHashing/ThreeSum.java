package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		
		System.out.println(threeSum(nums));

//		List<Integer> list = new ArrayList<>();
//		List<List<Integer>> result = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		System.out.println(list);
//		list.add(3);
//		System.out.println(list);
		
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> result = new HashSet<>();
		int size = nums.length;
		Arrays.sort(nums);
		for(int i = 0 ; i< size-2 ; i++) {
			int j = i+1;
			int k = size-1;
			int target = 0-nums[i];
			while(j<k) {
				int tempSum = nums[j] + nums[k];
				if(target == tempSum) {
					result.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
					while(j<k && nums[j]==nums[j+1]) j++;
					while(j<k && nums[k]==nums[k-1]) k--;
					j++;
					k--;
				}
				else if(tempSum<target) {
					j++;
				}else k--;
			}
		}
		
		
		return new ArrayList<>(result);
	}
}
