import java.math.BigInteger;
import java.util.Scanner;

public class LuckyDivision {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		BigInteger n = in.nextBigInteger();

		int count = 0;
		while (n.compareTo(BigInteger.ZERO) > 0) {
			if (isLucky(n.mod(BigInteger.valueOf(10)))) {
				count++;
			}
			n = n.divide(BigInteger.valueOf(10));
		}

		if (isLucky(count)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		in.close();
	}

	public static boolean isLucky(BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) == 0) { return false; }
		while (n.compareTo(BigInteger.ZERO) > 0 && (n.mod(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(4)) == 0
				|| n.mod(BigInteger.valueOf(10)).compareTo(BigInteger.valueOf(7)) == 0)) {
			n = n.divide(BigInteger.valueOf(10));
		}

		return n.compareTo(BigInteger.ZERO) == 0;
	}

	public static boolean isLucky(int n) {
		if (n == 0) { return false; }

		while (n > 0 && (n % 10 == 4 || n % 10 == 7)) {
			n /= 10;
		}
		return n == 0;
	}
}
