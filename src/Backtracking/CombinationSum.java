package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int cadidates[] = new int[] {2,3,6,7};
		int target =7;
		List<List<Integer>> result = combinationSum(cadidates, target);
		System.out.println(result);
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        helper(candidates, target , 0, result , new ArrayList<Integer>(),0);
        return result;
    }

	private static void helper(int[] candidates, int target, int i, List<List<Integer>> result,
			List<Integer> list,int currSum) {
		
		if(currSum == target) {
			result.add(new ArrayList<>(list));
			return;
		}
		if(currSum > target || i==candidates.length) {
			return;
		}
		if((target-currSum) >= candidates[i]) {
			list.add(candidates[i]);
			currSum += candidates[i];
			helper(candidates , target , i, result , list , currSum);
			list.remove(list.size()-1);
			currSum -= candidates[i];
		}
		helper(candidates , target , i+1, result , list , currSum);
	}
	
	
}
