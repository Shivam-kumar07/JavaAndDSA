package Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String str = "]";
		System.out.println(isValid(str));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		HashMap<Character,Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		int size = s.length();
		for(int i = 0 ; i< size ; i++) {
			char currentChar = s.charAt(i);
			if(currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.push(Character.valueOf(currentChar));
			}
			else {
				if(stack.isEmpty() || stack.pop() != map.get(currentChar)) {
					return false;
				}
			}
		}
		
		if(stack.size() != 0) return false;
        return true;
    }
}
