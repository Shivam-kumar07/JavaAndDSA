package BinarySearch;

public class KokoEatingBananas {

	public static void main(String[] args) {
		int []piles = {805306368,805306368,805306368};
		int h = 1000000000;
		int result = minEatingSpeed(piles, h);
		System.out.println(result);

	}

	public static int minEatingSpeed(int[] piles, int h) {
		int max = 0;
		for(int i : piles) {
			if(i>max) max = i;
		}
		int k = max;
		int i = 1;
		int j = max;
		while(i<=j) {
			int mid = i + (j-i)/2;
			if(checkK(piles , h , mid)) {
				k=mid;
				j=mid-1;
			}else {
				i=mid+1;
			}
		}
		return k;
	}

	public static boolean checkK(int[] piles , int h , int k){
		long hoursWithK = 0;
        for(int  i : piles){
        	long temp = (long) Math.ceil((double)i/k);
            hoursWithK += temp;
        }
        if(hoursWithK <= h) return true;
        return false;
    }

}
