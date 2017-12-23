import java.io.IOException;

public class ChrisAndTheMagicSquare {
	public static void main(String[] args) throws IOException {
		FScanner in = new FScanner();

		int n = in.nInt();
		int[][] grid = new int[n][n];

		if (n == 1) {
			System.out.println(-1);
			System.exit(0);;
		}

		int x = 0, y = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = in.nInt();

				if (grid[i][j] == 0) {
					x = i;
					y = j;
				}
			}
		}

		
		in.close();
	}
}
