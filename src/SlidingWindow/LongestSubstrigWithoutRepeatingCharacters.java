package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrigWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abcabcbb";
		int result  = lengthOfLongestSubstring(str);
		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {
		Map<Character,Integer> map = new HashMap<>();
		int i = 0 ;
		int j = 0;
		int size = s.length();
		int max = 0;
		while(j<size) {
			char c = s.charAt(j);
			if(!map.containsKey(c)) {
				map.put(c,j);
				if((j-i+1) > max) {
					max = j-i+1;
				}
			}else {
				int temp = map.get(c);
				while(i<=temp) {
					map.remove(s.charAt(i));
					i++;
				} 
				map.put(c, j);
			}
			j++;
			
		}
		return max;
	}

}
