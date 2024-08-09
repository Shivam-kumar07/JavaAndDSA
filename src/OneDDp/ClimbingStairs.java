package OneDDp;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(climbStairs(n));
	}

	public static int climbStairs(int n) {
		if(n==0 || n==1 || n==2) return n;
		int prev = 1;
		int secPrev = 2;
		int result=0;
		for(int i = 3 ; i<= n ; i++ ) {
			result = prev+ secPrev;
			prev = secPrev;
			secPrev = result;
		}
		return result;
	}

}
