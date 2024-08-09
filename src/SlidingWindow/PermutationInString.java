package SlidingWindow;

public class PermutationInString {

	public static void main(String[] args) {
		String s1= "hello";
		String s2= "ooolleoooleh";
		boolean b = checkInclusion(s1, s2);
		System.out.println(b);
	}

	public static boolean checkInclusion(String s1, String s2) {
		int char_count_s1[] = new int[26];
		int size1 = s1.length();
		int size2 = s2.length();
		for(int i = 0 ; i < size1 ; i++) {
			char_count_s1[s1.charAt(i) - 'a']++;
		}
		int window_end = 0;
		for(int window_start = 0 ; window_start<size2 ; window_start++) {
			char currenChar = s2.charAt(window_start);
			if(char_count_s1[currenChar-'a']>0) {
				window_end = window_start;
				int window_char_count[] = new int[26];
				while(window_end<size2 &&
						char_count_s1[ s2.charAt(window_end) - 'a'] >0 && 
						window_char_count[s2.charAt(window_end)-'a'] < char_count_s1[s2.charAt(window_end)-'a'] ) {
					window_char_count[s2.charAt(window_end) - 'a']++;
					if(window_end - window_start +1 >= size1) {
						return true;
					}
					window_end++;
				}
			}
		}
		return false;
	}

}
