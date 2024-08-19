package OneDDp;

//Note: This question is done with 2D dp
public class LongestPalindromicSubstring {
	public static String result= "";
	public static void main(String[] args) {
		String s= "ccc";
		System.out.println(longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {
		int n = s.length();
		if(n==0 || n==1) return s;
		int dp[][] = new int[n][n];
		int start = 0;
		int end = 0;
		for(int i = 0 ; i<n ; i++) {
			dp[i][i] = 1;
		}
		for(int i=0 ; i<n-1 ; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				dp[i][i+1] =1;
				start = i;
				end = i+1;
			}
		}
		for(int i =2 ; i<n ; i++) {
			for(int j = 0 ; j<n-i ; j++) {
				if( s.charAt(j)==s.charAt(j+i) && dp[j+1][j+i-1] == 1 ) {
					dp[j][j+i] =1;
					if((i+1) > (end-start+1)) {
						start = j;
						end = j+i;
					}
				}
			}
		}
		
		return s.substring(start,end+1);
	}

}
