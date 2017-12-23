import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n) {
					if (i % 2 == 0 && j % 2 == 0) {
						System.out.println("YES");
						System.exit(0);
					}
				}
			}
		}

		System.out.println("NO");
		in.close();
	}
}
