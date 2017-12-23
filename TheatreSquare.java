import java.math.BigInteger;
import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double m = in.nextDouble(), n = in.nextDouble(), a = in.nextDouble();
		double c = m / a, d = n / a, e = Math.ceil(c), f = Math.ceil(d);

		System.out.println(BigInteger.valueOf((long) e).multiply(BigInteger.valueOf((long) f)));

		in.close();
	}
}
