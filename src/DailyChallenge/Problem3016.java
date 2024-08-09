package DailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3016 {

	public static void main(String[] args) {
		String word = "xxxaab";
		int result = minimumPushes(word);
		System.out.println(result);
	}

	public static int minimumPushes(String word) {
		int [] freq = new int [26];
		for (int i = 0 ; i < word.length() ; i++) {
			freq[word.charAt(i)-'a']++;
		}
		Arrays.sort(freq);
		int result = 0;
		for(int i = 25 ; i>= 0 ; i--) {
			if(i>17) {
				result = result + freq[i]*1;
			}
			else if( i> 9) {
				result = result + freq[i]*2;
			}
			else if(i>1){
				result += freq[i]*3;
			}
            else result +=freq[i]*4;
		}
		return result;
	}

}
