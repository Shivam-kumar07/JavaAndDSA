package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets2 {

	public static void main(String[] args) {
		int nums[] = {1,2,2};
		List<List<Integer>> subsetsWithDup = subsetsWithDup(nums);
		System.out.println(subsetsWithDup);
		
	}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Set<String> set = new HashSet<>();
		helper(result , 0 ,nums,new ArrayList<Integer>(),set);
		return result;
    }
	private static void helper(List<List<Integer>> result, int i, int[] nums, ArrayList<Integer> list,Set<String> set) {
		if(i == nums.length) {
			List<Integer> list2= new ArrayList<>(list);
			Collections.sort(list2);
			if(!set.contains(list2.toString())) {
				set.add(list2.toString());
				result.add(new ArrayList<>(list2));
			}
			
			return;
		}
		list.add(nums[i]);
		helper(result , i+1 , nums,list,set );
		list.remove(list.size()-1);
		helper(result , i+1 , nums,list,set );	
	}

}
