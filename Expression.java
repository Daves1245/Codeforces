import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

		System.out.println(max(a + b * c, max(a * (b + c), max(a * b * c, (a + b) * c))));

		in.close();
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
