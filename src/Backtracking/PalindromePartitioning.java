package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	public static List<List<String>> result = new ArrayList<>();
	public static void main(String[] args) {
		String s = "aab";
		List<List<String>> partition = partition(s);
	}

	public static List<List<String>> partition(String s) {
		
		return result;
	}
	public static boolean checkPalindrome(String str, int start , int end){
        while(start<=end){
            if(str.charAt(start++)!= str.charAt(end--)) return false;
        }
        return true;
    }

}
