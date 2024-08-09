package BinarySearch;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		int nums1[] = {1,5,8,10,13};
		int nums2[] = {3,5,7,9};
		double d = findMedianSortedArrays(nums1, nums2);
		System.out.println(d);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//let nums1 be array A
		//let nums2 be array B
		int m = nums1.length;
		int n = nums2.length;
		//To make sure that nums1 length should be less than nums2 length
		if(m>n) return findMedianSortedArrays(nums2, nums1);
		
		int realMid = (m+n+1)/2;
		int i = 0;
		int j = m;
		while(i<=j) {
			int mid = (i+j)/2;
			int leftASize = mid;
			int leftBSize = realMid - mid;
			
			// leftA is right-most element of Array A's left portion 
			int leftA = (leftASize > 0)? nums1[leftASize-1] : Integer.MIN_VALUE;
			// leftA is left-most element of Array A's right portion 
			int rightA = (leftASize < m)? nums1[leftASize] : Integer.MAX_VALUE;
			// leftB is right-most element of Array B's left portion 
			int leftB = (leftBSize > 0) ? nums2[leftBSize-1] : Integer.MIN_VALUE;
			// leftA is left-most element of Array B's right portion 
			int rightB = (leftBSize < n) ? nums2[leftBSize] : Integer.MAX_VALUE;
			
			if(leftA<=rightB && leftB<=rightA) {
				if ((m + n) % 2 == 0)
                    return (Math.max(leftA, leftB)
                            + Math.min(rightA, rightB))
                            / 2.0;
                return Math.max(leftA, leftB);
			}
			else if(leftB>rightA) {
				i = mid+1;
			}
			else j = mid-1;
		}
		
		return 0.0;
	}

}
