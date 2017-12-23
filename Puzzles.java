import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), puzzles[] = new int[in.nextInt()];

		for (int i = 0; i < puzzles.length; i++) {
			puzzles[i] = in.nextInt();
		}
		Arrays.sort(puzzles);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= puzzles.length - n; i++) {
			min = Math.min(min, puzzles[i + (n - 1)] - puzzles[i]);
		}
		System.out.println(min);
		in.close();
	}
}
