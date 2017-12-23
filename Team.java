import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		int count = 0;
		for (int t = 0; t < T; t++) {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += in.nextInt();
			}

			if (sum > 1) {
				count++;
			}
		}

		System.out.println(count);

		in.close();
	}
}
