import java.util.Scanner;

public class BTheNumberOnTheBoard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = in.nextInt();
		int n = in.nextInt();
		
		
		in.close();
	}

	static long digSum(long n) {
		long ret = 0;

		if (n < 0) n = -n;

		while (n > 0) {
			ret += n % 10;
			n /= 10;
		}

		return ret;
	}
}