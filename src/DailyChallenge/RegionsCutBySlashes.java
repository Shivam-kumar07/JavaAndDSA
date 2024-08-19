package DailyChallenge;

// Leetcode Problem #959. Regions Cut By Slashes
// Not Done
public class RegionsCutBySlashes {

	public static void main(String[] args) {
		String []grid = {"//","/ "};
//		System.out.println(grid[0].length());
		System.out.println(regionsBySlashes(grid));
	}

	public static int regionsBySlashes(String[] grid) {
		int n = grid.length;
		boolean visited[][] = new boolean[n][n];
		int result = 1;
		for(int i = 0 ; i<n ; i++) {
			for (int j = 0 ; j< n ; j++) {
				if(visited[i][j] == true) continue;
				visited[i][j] = true;
				char c = grid[i].charAt(j);
				if(c==' ') continue;
				if(c=='/') {
					int row = i+1;
					int column = j-1;
					boolean rowFlag = i==0?true:false ; 
					boolean columnFlag= j==0?true:false;
					boolean flag = true;
					while(flag) {
						if(!(row<0) && !(row>=n) && !(column<0) && !(column>=n)) {
							char curr = grid[row].charAt(column);
							if(curr !='/') {
								break;
							}
							else {
								visited[row][column] =true;
								if(!rowFlag && row == 0) {
									rowFlag = true;
								}
								if(!columnFlag && column==0) {
									columnFlag=true;
								}
								if(rowFlag && columnFlag) {
									result++;
									flag = false;
								}
							}
							
						}else {
							if(rowFlag && columnFlag) result++;
							break;
						};
					}
				}
				if(c == '\\') {
					int row = i+1;
					int column = j-1;
					boolean rowFlag = i==(n-1)?true:false ; 
					boolean columnFlag= j==(n-1)?true:false;
					boolean flag = true;
					while(flag) {
						if(!(row<0) && !(row>=n) && !(column<0) && !(column>=n)) {
							char curr = grid[row].charAt(column);
							if(curr !='/') {
								break;
							}
							else {
								visited[row][column] =true;
								if(!rowFlag && row == 0) {
									rowFlag = true;
								}
								if(!columnFlag && column==0) {
									columnFlag=true;
								}
								if(rowFlag && columnFlag) {
									result++;
									flag = false;
								}
							}
							
						}else {
							if(rowFlag && columnFlag) result++;
							break;
						};
					}
				}
			}
		}
		return result;
	}

}
