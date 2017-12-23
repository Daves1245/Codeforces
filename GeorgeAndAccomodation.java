import java.util.Scanner;

public class GeorgeAndAccomodation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		int count = 0;
		for (int t = 0; t < T; t++) {
			if (in.nextInt() + 2 <= in.nextInt()) {
				count++;
			}
		}

		System.out.println(count);

		in.close();
	}
}
