package ArraysAndHashing;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = {{'.','.','.','.','.','3','2','.','4'},{'.','.','.','.','2','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','6','.','.','.','.','7','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','9','.','.','.','.'},{'3','.','.','1','.','.','.','8','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}};
		System.out.println(isValidSudoku(board));

	}

	public static boolean isValidSudoku(char[][] board) {
		if (checkRows(board)) {
			if (checkColumns(board)) {
				return checkBoxes(board);
			}
		}
		return false;
	}

	public static boolean checkRows(char[][] board) {
		for (int i = 0; i < 9; i++) {
			int[] arr = new int[10];
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					continue;
				} else {
					int index = Integer.parseInt(String.valueOf(board[i][j]));
					arr[index]++;
					if (arr[index] > 1) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean checkColumns(char[][] board) {
		for (int i = 0; i < 9; i++) {
			int[] arr = new int[10];
			for (int j = 0; j < 9; j++) {
				if (board[j][i] == '.') {
					continue;
				} else {
					int index = Integer.parseInt(String.valueOf(board[j][i]));
					arr[index]++;
					if (arr[index] > 1) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean checkBoxes(char[][] board) {

		for (int i = 0; i < 9; i++) {
			int[] arr = new int[10];
			int row = 3 * (i % 3);
			int column = 3 * (i/3);
			for (int j = 0; j < 9; j++) {
				int iIndex = row + (j / 3);
				int jIndex = column + (j % 3);

				if (board[iIndex][jIndex] == '.') {
					continue;
				} else {
					int index = Integer.parseInt(String.valueOf(board[iIndex][jIndex]));
					arr[index]++;
					if (arr[index] > 1) {
						return false;
					}
				}

			}
		}

		return true;
	}
}
