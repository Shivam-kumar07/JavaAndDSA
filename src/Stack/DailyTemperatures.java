package Stack;

import java.util.Stack;

//Leetcode 739

public class DailyTemperatures {

	public static void main(String[] args) {
		int temperatures[] = {55,38,53,81,61,93,97,32,43,78};
		int[] dailyTemperatures = dailyTemperatures(temperatures);
		
//		Second Method
//		int[] dailyTemperatures = methodTwo(temperatures);
		for(int i : dailyTemperatures) {
			System.out.print(i + "   ");
		}
	}

	public static int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int result[] = new int[n];
		Stack<int[]> stack = new Stack<>();
		for(int i = n-1 ; i>=0 ; i--) {
			int value = 0;
			while(!stack.isEmpty() &&  stack.peek()[0] <= temperatures[i] ) {
				value += stack.peek()[1];
				stack.pop();
			}
			if(stack.isEmpty()) {
				value = 0;
			}else {
				value++;
			}
			stack.push(new int[] {temperatures[i], value});
			result[i] = value;
		}
		
		
		return result;
	}
	
	public static int[] methodTwo(int[] temperatures) {
		Stack<Integer> s=new Stack<>();
        int n=temperatures.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int currTemp=temperatures[i];
            while(!s.isEmpty() && temperatures[s.peek()]<currTemp){
                int k=s.pop();
                res[k]=i-k;
            }
            s.push(i);
        }
        return res;
	}
}
