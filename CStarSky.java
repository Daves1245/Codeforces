import java.util.ArrayList;
import java.util.Scanner;

public class CStarSky {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int c = in.nextInt();

		ArrayList<Integer>[][] stars = new ArrayList[101][101];

		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (stars[x][y] == null) {
				stars[x][y] = new ArrayList<Integer>();
			}

			stars[x][y].add(in.nextInt());
		}

		int[][][] brightness = new int[101][101][c + 1];
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				for (int t = 0; t < c + 1; t++) {
					if (stars[x][y] != null) {
						for (int s : stars[x][y]) {
							brightness[x][y][t] += (s + t) % (c + 1);
						}
					}
				}
			}
		}

		for (int x = 0; x <= 100; x++) {
			for (int y = 1; y <= 100; y++) {
				for (int t = 0; t < c + 1; t++) {
					brightness[x][y][t] += brightness[x][y - 1][t];
				}
			}
		}

		for (int i = 0; i < q; i++) {
			int time = in.nextInt() % (c + 1);
			int x1 = in.nextInt(), y1 = in.nextInt();
			int x2 = in.nextInt(), y2 = in.nextInt();

			long totalBrightness = 0;

			for (int x = x1; x <= x2; x++) {
				if (y1 == 0) {
					totalBrightness += brightness[x][y2][time];
				} else {
					if (brightness[x][y2][time] != 0)
						totalBrightness += brightness[x][y2][time] - brightness[x][y1 - 1][time];
				}
			}

			System.out.println(totalBrightness);
		}
		in.close();
	}
}