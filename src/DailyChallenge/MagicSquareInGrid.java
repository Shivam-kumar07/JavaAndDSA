package DailyChallenge;

import java.util.HashSet;
import java.util.Set;

// Leetcode Problem #840. Magic Squares In Grid
public class MagicSquareInGrid {

	public static void main(String[] args) {
		int [][]grid = {{1,8,6},{10,5,0},{4,2,9}};
		System.out.println(numMagicSquaresInside(grid));
	}

	public static int numMagicSquaresInside(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		if(m<3 || n<3) return 0;
		int result = 0;
		for(int i = 0 ; i< (m-3+1); i++) {
			for(int j = 0 ; j<(n-3+1); j++) {
				if(checkSquare(grid, i , j)) {
					result++;
				}
			}
		}
		return result;
	}

	private static boolean checkSquare(int[][] grid, int rowNum, int colNum) {
		//row sum
		if(( grid[rowNum][colNum] + grid[rowNum][colNum+1] + grid[rowNum][colNum+2] ) !=15) return false;
		//column sum
		if(( grid[rowNum][colNum] + grid[rowNum+1][colNum] + grid[rowNum+2][colNum] ) !=15) return false;
		//both diagonal sum
		if(( grid[rowNum][colNum] + grid[rowNum+1][colNum+1] + grid[rowNum+2][colNum+2] ) !=15) return false;
		if(( grid[rowNum+2][colNum] + grid[rowNum+1][colNum+1] + grid[rowNum][colNum+2] ) !=15) return false;
		
		Set<Integer> set = new HashSet<>();
		for(int i = rowNum ; i <(rowNum+3) ; i++ ) {
			for(int j = colNum ; j < (colNum+3) ; j++) {
				if(grid[i][j]<1 || grid[i][j]>9) return false;
				if(!set.contains(grid[i][j])) set.add(grid[i][j]);
				else return false;
			}
		}
		return true;
	}

}
