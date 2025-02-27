package OneDDp;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(rob(nums));

	}

	public static int rob(int[] nums) {
//		Result res= new Result();
//		helper(nums, res , 0,0);
//		return res.result;
		int n = nums.length;
		if(n==1) return nums[0];
		if(n==2) return Math.max(nums[0], nums[1]);
		int dp[] = new int[n];
		dp[0]= nums[0];
		dp[1]= Math.max(nums[0], nums[1]);
		for(int i = 2; i<n;i++) {
			dp[i] = Math.max(nums[i]+ dp[i-2], dp[i-1]);
		}
		return dp[n-1];
	}

	//Recursion
	private static void helper(int[] nums, Result res, int i, int currentRobbed) {
		if(i>=nums.length) {
			res.result = Math.max(currentRobbed, res.result);
			return;
		}
		helper(nums, res, i+2 , currentRobbed+nums[i]);
		helper(nums , res , i+1 , currentRobbed);
	}

}
