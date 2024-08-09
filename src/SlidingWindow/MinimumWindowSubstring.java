package SlidingWindow;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABN";
		String result = minWindow(s, t);
		System.out.println(result);

	}
	public static String minWindow(String s , String t) {
		int len1 = s.length();
        int len2 = t.length();
 
        // Check if string's length is
        // less than pattern's
        // length. If yes then no such
        // window can exist
        if (len1 < len2) {
            // System.out.println("No such window exists");
            return "";
        }
 
        int hash_pat[] = new int[256];
        int hash_str[] = new int[256];
 
        // Store occurrence ofs
        // characters of pattern
        for (int i = 0; i < len2; i++)
            hash_pat[t.charAt(i)]++;
 
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
 
        // Start traversing the string
        // Count of characters
        int count = 0;
        for (int j = 0; j < len1; j++) {
           
            // Count occurrence of characters
            // of string
            hash_str[s.charAt(j)]++;
 
            // If string's char matches
            // with pattern's char
            // then increment count
            if (hash_str[s.charAt(j)]
                <= hash_pat[s.charAt(j)])
                count++;
 
            // If all the characters are matched
            if (count == len2) {
               
                // Try to minimize the window
                while (hash_str[s.charAt(start)]
                           > hash_pat[s.charAt(start)]
                       || hash_pat[s.charAt(start)]
                              == 0) {
 
                    if (hash_str[s.charAt(start)]
                        > hash_pat[s.charAt(start)])
                        hash_str[s.charAt(start)]--;
                    start++;
                }
 
                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
 
        // If no window found
        if (start_index == -1) {
            // System.out.println("No such window exists");
            return "";
        }
 
        // Return substring starting
        // from start_index
        // and length min_len
        return s.substring(start_index,
                             start_index + min_len);
	}
	
	
	
	

//	public static String minWindow(String s, String t) {
//		int m = s.length();
//		int n = t.length();
//		
//		if(n>m) return "";
//		
//		String result = "";
//		int minSize = Integer.MAX_VALUE;
//		int t_freq[] = new int[256];
//		for(int i = 0 ; i< n ; i++) {
//			t_freq[t.charAt(i)]++;
//		}
//		int window_char_count[] = new int[256];
//		int window_end = 0;
//		int window_start = 0;
//		//charCount is to store how many required character are covered in this window
//		int charCount = 0;
//		boolean flag = true;
//		while(window_start<m ) {
//			char currenChar = s.charAt(window_end);
//			if(t_freq[currenChar]>0) {
//				window_end = window_end<window_start?window_start : window_end;
//				
//				while(window_end<m && charCount< n ) {
//					if(t_freq[s.charAt(window_end) ] >0 && 
//							window_char_count[s.charAt(window_end)] < t_freq[s.charAt(window_end)]) {
//						window_char_count[s.charAt(window_end)]++;
//						charCount++;
//					}
//					window_end++;
//				}
//				if(charCount==n && window_end - window_start < minSize) {
//					flag = false;
//					minSize= window_end - window_start;
//					result = s.substring(window_start, window_end);
//				}
//			}
//			else {
//				window_end++;
//				continue;
//			}
//			window_start++;
//			if(!flag) {
//				window_char_count[s.charAt(window_start)]--;
//				charCount--;
//				while(window_start<m && t_freq[s.charAt(window_start)]==0) {
//					window_start++;
//				}
//				flag = true;
//			}
//			
//		}
//		
//		return result;
//	}

}
