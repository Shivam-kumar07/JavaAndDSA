package BinarySearch;

// Leetcode
// 153. Find Minimum in Rotated Sorted Array

public class MinInRotatedArray {

	public static void main(String[] args) {
		int arr[] = {2,1};
		int result = findMin(arr);
		System.out.println(result);
	}

	public static int findMin(int[] nums) {
		int size = nums.length;
//		if(size == 2) {
//			return nums[0]<nums[1]?nums[0]:nums[1];
//		}
		int i = 0 ;
		int j = size - 1;
		int result = nums[0];
		while(i<=j) {
			int mid = i + (j-i)/2;
			int currentValue = nums[mid];
			//Below condition means that we are in left portion of the rotated array
			if(currentValue >= nums[0]) {
				i = mid+1;
			}
			//else block will run if currentValue is in right portion
			else {
				//if array is not rotated we will find our answer at index 0
				if(mid == 0) {
					result = nums[mid];
					break;
				}
				//if array is rotated and not already in sorted order
				else {
					//we will find our answer in right portion if current Value's left element is greater
					if(currentValue < nums[mid-1]) {
						result  = nums[mid];
						break;
					}
					else {
						j = mid-1;
					}
				}
			}
		}
		return result;
	}

}
