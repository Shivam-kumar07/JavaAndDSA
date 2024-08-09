package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum2 {

	public static void main(String[] args) {
		int nums[] = {1,1};
		int target = 1;
		List<List<Integer>> result = combinationSum2(nums, target);
		System.out.println(result);
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Set<String> set = new HashSet<>();
		helper(result,candidates , target , 0, new ArrayList<>(),set);
		return result;
	}

	private static void helper(List<List<Integer>> result, int[] candidates, int target, int i, List<Integer> list,Set<String> set) {
		
		if(target == 0) {
			List<Integer> list2= new ArrayList<>(list);
			Collections.sort(list2);
			if(!set.contains(list2.toString())) {
				set.add(list2.toString());
				result.add(new ArrayList<>(list));
			}
			
			return;
		}
		if(i==candidates.length) return;
		if(target<0)return;
		
		list.add(candidates[i]);
		target -=candidates[i];
		helper(result, candidates, target, i+1 , list,set);
		list.remove(list.size()-1);
		target +=candidates[i];
		helper(result, candidates , target, i+1, list,set);
		
	}

}
