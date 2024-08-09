package ArraysAndHashing;

//287. Find the Duplicate Number

public class findDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,3,4,2,2};
		System.out.println(findDuplicate(arr));
	}
	public static int findDuplicate(int[] nums) {
		for(int i = 0 ; i< nums.length ; i++) {
			int temp = Math.abs(nums[i]);
			if(nums[temp-1]< 0) {
				return temp;
			}
			nums[temp-1] = 0-nums[temp-1];
		}
        return 0;
        
    }

}
