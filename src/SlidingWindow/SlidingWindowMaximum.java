package SlidingWindow;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int []arr = {1,3,-1,-3,5,3,6,7};
		int k = 5;
		int result [] = maxSlidingWindow(arr, k);
		for(int i : result) {
			System.out.print(i + "  ");
		}
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int N = nums.length;
		if(k>=N) {
			int max = Integer.MIN_VALUE;
			for(int i : nums) {
				max = Math.max(max, i);
			}
			return new int[] {max};
		}
		int result[] = new int[N-k+1];
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i<k ; i++) {
			max = Math.max(max, nums[i]);
		}
		for(int i = 1; i< N-k+1 ; i++ ) {
			
		}
		
		
		
		return result;
	}

}
