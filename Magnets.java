import java.util.Scanner;

public class Magnets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int groups = 1;

		int tmp = in.nextInt();
		for (int i = 1; i < n; i++) {
			int m = in.nextInt();

			if (m != tmp) {
				groups++;
				tmp = m;
			}
		}

		System.out.println(groups);

		in.close();
	}
}
