package BinarySearch;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		int nums[] = {1,3,5};
		int target = 1;
		int result  = search(nums, target);
		System.out.println(result);
	}
	public static int search(int[] nums , int target) {
		int size = nums.length;
		int i = 0 ;
		int j = size - 1;
		int result = -1;
		while(i<=j) {
			int mid = i + (j-i)/2;
			int currentValue = nums[mid];
			//Below condition means that we are in left portion of the rotated array
			if(currentValue >= nums[0]) {
				if(currentValue == target) {
					result = mid;
					break;
				}
				if(target>currentValue || target<nums[0]) {
					i = mid + 1;
				}else {
					j = mid -1;
				}
			}
			//else block will run if currentValue is in right portion
			else {
				if(currentValue == target) {
					result = mid;
					break;
				}
				if(target<currentValue || target>=nums[0]) {
					j = mid - 1;
				}else {
					i = mid + 1;
				}
			}
		}
		return result;
	}

}
