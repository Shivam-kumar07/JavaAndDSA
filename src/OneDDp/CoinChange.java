package OneDDp;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins = {1,2,5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}

	public static int coinChange(int[] coins, int amount) {
		if(coins.length == 0) return -1;
		if(amount == 0) return 0;
		int []dp = new int[amount+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] =0;
		for(int i = 1;i<=amount ; i++) {
			for(int j = 0 ; j<coins.length ; j++) {
				if(i-coins[j] >= 0) {
					if(dp[i-coins[j]] < dp[i]) {
						dp[i] = dp[i-coins[j]]+1;
					}
				}
			}
		}
		return dp[amount];
	}
//	// This is recursive solution but it will throw stack overflow
//	public static int coinChange(int[] coins, int amount) {
//		if (coins.length == 0)
//			return -1;
//		int currentAmount = 0;
//		int result[] = new int[1];
//		result[0] = Integer.MAX_VALUE;
//		recustionHelper(coins, amount, result, currentAmount, 0);
//		if (result[0] == Integer.MAX_VALUE)
//			return -1;
//		return result[0];
//	}
//
//	private static void recustionHelper(int[] coins, int amount, int[] result, int currentAmount, int count) {
//		if (currentAmount == amount) {
//			if (count < result[0])
//				result[0] = count;
//			return;
//		}
//		if (currentAmount > amount)
//			return;
//		for (int i = 0; i < coins.length; i++) {
//			recustionHelper(coins, amount, result, currentAmount + coins[i], count + 1);
//		}
//	}

}
