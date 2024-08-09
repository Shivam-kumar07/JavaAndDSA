package BinarySearch;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
//		int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int matrix[][] = {{1}};
		System.out.println(searchMatrix(matrix, 0));
	}	

	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int total = m*n;
		int i = 0;
		int j = total-1;
		while(i<=j) {
			int mid = i + (j-i)/2;
			int row = mid/n;
			int column = mid%n;
			if(matrix[row][column] == target) {
				return true;
			}
			if(target> matrix[row][column]) i= mid+1;
			else j = mid-1;
		}
		return false;
	}

}
