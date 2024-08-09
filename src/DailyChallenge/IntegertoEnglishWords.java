package DailyChallenge;

public class IntegertoEnglishWords {
	public final static String[] belowTen = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	public final static String[] belowTwenty = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen"};
	public final static String belowHundred[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	public final static String more[] = {"","Thousand","Million","Billion"};
	

	public static void main(String[] args) {
		int num =1000000;
		String result = numberToWords(num);
		System.out.println(result);

	}

	public static String numberToWords(int num) {
		if(num == 0) return "Zero";
		String result = "";
		int i = 0;
		while(num>0) {
			if(num%1000 !=0) {
				result = helper(num%1000) + more[i]+" " + result;
			}
			i++;
			num /= 1000;
		}
		return result.trim();
	}

	private static String helper(int num) {
		if(num == 0) {
			return "";
		}
		if(num < 10) {
			return belowTen[num]+" ";
		}
		if(num < 20) {
			return belowTwenty[num%10]+" ";
		}
		if(num < 100) {
			return belowHundred[num/10] +" "+  helper(num%10);
		}
		if(num<1000) {
			return belowTen[num/100] + " Hundred " + helper(num%100);
		}
		
		return "";
	}

}
