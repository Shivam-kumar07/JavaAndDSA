package Backtracking;

public class WordSearch {

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		System.out.println(exist(board, word));
	}

	public static boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		boolean visited[][] = new boolean[m][n];
		for (int i = 0; i < board.length; ++i)
			for (int j = 0; j < board[0].length; ++j)
				if (solve(board, word, visited, i, j, 0))
					return true;
		return false;
	}

	private static boolean solve(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
		if (index == word.length())
			return true;
		if (i < 0 || i == board.length || j < 0 || j == board[0].length)
			return false;
		int m = board.length;
		int n = board[0].length;
		boolean solveResult = false;
		if (visited[i][j] == false && word.charAt(index) == board[i][j]) {
			visited[i][j] = true;
			solveResult = solve(board, word, visited, i, j + 1, index + 1)
					|| solve(board, word, visited, i + 1, j, index + 1)
					|| solve(board, word, visited, i - 1, j, index + 1)
					|| solve(board, word, visited, i, j - 1, index + 1);
			visited[i][j] = false;
		} else {
			return false;
		}
		return solveResult;
	}

}
