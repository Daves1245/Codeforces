import java.math.BigInteger;
import java.util.Scanner;

public class HelloWorldThingForCodeforces {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println(fac(in.nextInt()));

		in.close();
	}

	public static BigInteger fac(int n) {
		BigInteger m = BigInteger.valueOf(n);

		while (m.compareTo(BigInteger.ZERO) > 0) {
			m = m.multiply(m = m.subtract(BigInteger.ONE));
		}

		return m;
	}
}
