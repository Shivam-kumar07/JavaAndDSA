package SlidingWindow;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int target =7;
		int []nums= {5};
		int result = minSubArrayLen(target, nums);
		System.out.println(result);
 	}
	public static int minSubArrayLen(int target, int[] nums) {
		int n = nums.length;
        if(n==1){
            if(target <= nums[0]) return 1;
            else return 0;
        }
        int i = 0 ;
        int j = 0;
        int currentSum = nums[i] ;
        int result  = Integer.MAX_VALUE;
        while(i<n && j<n && i<=j){
            int windowLength = j-i+1;
            if(currentSum >= target){
                if(windowLength < result) {
                    result = windowLength;
                }
                currentSum -= nums[i];
                i++;
            }
            else {
                j++;
                if(j<n) currentSum += nums[j];
            }
        }
        if(result == Integer.MAX_VALUE) return 0;
        return result;

    }

}
