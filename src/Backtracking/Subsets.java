package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int []nums  = {1,2,3};
		List<List<Integer>> result = subsets(nums);
		System.out.println(result);
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		helper(result , 0 ,nums,new ArrayList<Integer>());
		return result;

	}

	private static void helper(List<List<Integer>> result, int i, int[] nums, ArrayList<Integer> list) {
		if(i == nums.length) {
			result.add(new ArrayList<>(list));
			return;
		}
		list.add(nums[i]);
		helper(result , i+1 , nums,list );
		list.remove(list.size()-1);
		helper(result , i+1 , nums,list );	
	}


}
