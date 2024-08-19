package OneDDp;

public class DecodeWays {

	public static void main(String[] args) {
		String s = "2611055971756562";
		System.out.println(numDecodings(s));
	}

	public static int numDecodings(String s) {
		int n = s.length();
		if(s.charAt(0) == '0') return 0;
		if(s.length() == 1) {
			return 1;
		}
		int dp[] = new int[n+1];
		dp[0] =1;
		dp[1] = 1;
		for(int i = 1; i<n ; i++) {
			char c = s.charAt(i);
			char prev = s.charAt(i-1);
			if(c=='0') {
				String temp =s.substring(i-1, i+1);
				int number = Integer.parseInt(temp);
				if(!(number>0 && number<27)) return 0;
				else {
					dp[i+1] = dp[i-1];
					dp[i] = dp[i-1];
				}
			}
			else if(c<='9') {
				if(c<'7' && (prev=='1' || prev=='2')) {
					dp[i+1] = dp[i] + dp[i-1];
				}
				else if(prev == '1'){
					dp[i+1] = dp[i] + dp[i-1];
				}else {
					dp[i+1] = dp[i];
				}
			}
		}
		return dp[n];
	}

}
