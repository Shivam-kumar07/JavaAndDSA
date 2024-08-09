package DailyChallenge;

public class SpiralMatrix3 {

	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;
		int rStart = 1;
		int cStart = 0;
		int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);
		for (int i[] : result) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.print("-->");
		}

	}

	public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
		int result[][] = new int[rows * cols][2];
		boolean visited[][] = new boolean[rows][cols];
		result[0] = new int[]{rStart,cStart};
		visited[rStart][cStart] = true;;
		int visitedCount = 1;
//		move value significance
//		0 -> right
//		1 -> down
//		2 -> left
//		3 -> up
		int move = 0;
		while (visitedCount < rows*cols) {
			switch(move) {
			case 0:
				
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
			move++;
			move %= 4;
		}

		return result;
	}

}
























