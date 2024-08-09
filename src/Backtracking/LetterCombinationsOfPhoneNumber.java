package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Leetcode Problem #17 Letter Combinations of a Phone Number
public class LetterCombinationsOfPhoneNumber {

	public static void main(String[] args) {
		String digits = "";
		List<String> result = letterCombinations(digits);
		System.out.println(result);
		
	}

	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if(digits.length()==0) {
			return result;
		}
		Map<Character,String> map = new HashMap<>();
		mapfiller(map);
		List<String> inputList = new ArrayList<>();
		for(int i = 0; i< digits.length() ; i++) {
			inputList.add(map.get(digits.charAt(i)));
		}
		solve(digits, result, inputList,0,"");
		return result;
	}

	private static void solve(String digits,List<String> result, List<String> inputList, int i, String s) {
		if(i == digits.length()) {
			result.add(s);
			return;
		}
		String currentDigit = inputList.get(i); 
		for(int j = 0 ; j<currentDigit.length() ; j++) {
			solve(digits , result , inputList, i+1, s+currentDigit.charAt(j));
		}
	}

	private static void mapfiller(Map<Character, String> map) {
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
	}

}
