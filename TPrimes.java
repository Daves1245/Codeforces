import java.util.Scanner;

public class TPrimes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			System.out.println(isTPrime(in.nextInt()) ? "YES" : "NO");
		}

		in.close();
	}

	public static boolean isTPrime(int n) {
		if (n < 0) {
			return false;
		}

		int divs = 2; // 1 and N

		if (n % 2 == 0) {
			divs++;
		}

		for (int i = 3; i < n; i += (i % 2 == 0) ? 2 : 1) {
			if (n % i == 0) {
				divs++;
			}
		}

		return divs == 3;
	}
}
