import java.util.Scanner;

public class ImBoredWithLife {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println(factorial(Math.min(in.nextInt(), in.nextInt())));

		in.close();
	}

	public static long factorial(int n) {
		long ret = 1;
		while (n > 0) {
			ret *= n--;
		}
		return ret;
	}
}
