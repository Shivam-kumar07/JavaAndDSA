package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		int n = 3;
		List<String> generateParentheses = generateParentheses(n);
		System.out.println(generateParentheses);
	}

	public static List<String> generateParentheses(int n) {
		List<String> result = new ArrayList<>();
		recusrsionMethod(result , "(" , 3 , 1,0);
		return result;
	}

	private static void recusrsionMethod(List<String> result, String parentheses, int n, int start, int end) {
		if(start == n && end  == n) {
			result.add(parentheses);
		}
		if(start< n ) {
			recusrsionMethod(result , parentheses+"(" , n , start+1,end);
		}
		if(end< start && end<n) {
			recusrsionMethod(result , parentheses+")" , n , start,end+1);
		}
	}

}
