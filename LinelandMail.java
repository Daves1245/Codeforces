import java.util.Scanner;

public class LinelandMail {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] dists = new int[in.nextInt()];

		for (int i = 0; i < dists.length; i++) {
			dists[i] = in.nextInt();
		}

		System.out.print(Math.abs(dists[0] - dists[1]) + " ");
		System.out.println(Math.abs(dists[0] - dists[dists.length - 1]));

		for (int i = 1; i < dists.length - 1; i++) {
			System.out.print(Math.min(Math.abs(dists[i] - dists[i - 1]), Math.abs(dists[i] - dists[i + 1])) + " ");
			System.out.println(Math.max(Math.abs(dists[i] - dists[0]), Math.abs(dists[i] - dists[dists.length - 1])));
		}

		System.out.print(Math.abs(dists[dists.length - 1] - dists[dists.length - 2]) + " ");
		System.out.println(Math.abs(dists[dists.length - 1] - dists[0]));

		in.close();
	}
}