import java.util.Scanner;

public class CrazyComputer {
	public static void debug(Object o) {
		System.out.println("\tDEBUG: " + o.toString().replaceAll("\n", "\n\tDEBUG: "));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), c = in.nextInt();

		int count = 1;

		int a = 0, b = in.nextInt();
		for (int i = 1; i < n; i++) {
			a = b;
			b = in.nextInt();

			count++;

			if (b - a > c) {
				count = 1;
			}
		}

		System.out.println(count);
		
		in.close();
	}
}
