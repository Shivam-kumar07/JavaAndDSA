package SlidingWindow;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		String str = "AAAB";
		int k = 0;
		int result = characterReplacement(str, k);
		System.out.println(result);
	}

	public static int characterReplacement(String s, int k) {
		int size = s.length();
		int charCount[] = new int[26];
		int result = 0;
		int window_start = 0;
		int maxCount = 0;
		
		for(int window_end = 0 ; window_end<size ; window_end++ ) {
			charCount[s.charAt(window_end)-'A']++;
			int currentCharCount = charCount[s.charAt(window_end)-'A'];
			maxCount = Math.max(maxCount , currentCharCount);
			
			while(window_end - window_start - maxCount +1 > k) {
				charCount[s.charAt(window_start)-'A']--;
				window_start++;
			}
			
			result = Math.max(result, window_end - window_start +1);
			
		}
		return result;
	}
}
