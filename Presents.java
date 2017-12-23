import java.util.Scanner;

public class Presents {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] n = new int[in.nextInt() + 1];
		for (int i = 1; i < n.length; ++i) {
			n[in.nextInt() % n.length] = i;
		}

		for (int i = 1; i < n.length; ++i) {
			System.out.print(n[i] + " ");
		}

		in.close();
	}
}
