package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> permute = permute(nums);
		System.out.println(permute);
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Set<Integer> flag = new HashSet<>();
		helper(nums, result, flag, new ArrayList<>());
		return result;
	}

	private static void helper(int[] nums, List<List<Integer>> result, Set<Integer> flag, List<Integer> list) {
		if(list.size() == nums.length) {
//			System.out.println(list.toString());
			result.add(new ArrayList<Integer>(list));
			return;
		}
		
		for(int i = 0 ; i<nums.length ; i++) {
			if(!flag.contains(nums[i])) {
				flag.add(nums[i]);
				list.add(nums[i]);
				helper(nums, result, flag, list);
				flag.remove(nums[i]);
				list.remove(list.size()-1);
			} 	
		}
	}
}


