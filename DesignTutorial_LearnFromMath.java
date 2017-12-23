import java.util.Scanner;

public class DesignTutorial_LearnFromMath {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		sol(in.nextInt());

		in.close();
	}

	public static void sol(int n) {
		for (int i = 2; i <= n; i++) {
			if (c(i) && c(n - i)) {
				System.out.println(i + " " + (n - i));
				System.exit(0);
			}
		}
	}

	public static boolean c(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) { return true; }
		}

		return false;
	}
}
