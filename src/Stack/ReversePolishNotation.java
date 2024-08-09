package Stack;

import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		String []arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(evalRPN(arr));

	}

	public static int evalRPN(String[] tokens) {
		Set<String> set = Set.of("+", "*","/","-");
		Stack<Integer> stack = new Stack<>();
		for(String str : tokens) {
			if(!set.contains(str)){
				Integer temp = Integer.parseInt(str);
				stack.push(temp);
			}
			else {
				int second = stack.pop();
				int first = stack.pop();
				int equals =0;
				switch (str) {
				 case "+" :		equals = first + second;
				 				break;
				 case "-" : 	equals = first - second;
				 				break;
				 case "*" : 	equals = first * second;
				 				break;
				 case "/" : 	equals = first / second;
				 				break;
				}
				stack.push(equals);
			}
		}
		return stack.pop();
	}

}
