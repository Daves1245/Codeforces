import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] sizes = { in.nextInt(), in.nextInt(), in.nextInt() };
		int[] mcuts = new int[4001];
		int m = 0;
		Arrays.sort(sizes);
		mcuts[0] = 0;
		mcuts[sizes[0]] = mcuts[sizes[1]] = mcuts[sizes[2]] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				if (sizes[j] > i) break;
				mcuts[i] = max(mcuts[i], mcuts[i - sizes[j]] + 1);
			}
		}

		System.out.println(mcuts[n]);
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
