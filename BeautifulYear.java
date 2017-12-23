import java.util.Scanner;

/*
 * CodeForces 271A
 * Status: ACCEPTED
 * 10/15/17
 */
public class BeautifulYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (n++; !d(n); ++n);
		System.out.println(n);

		s.close();
	}

	public static boolean d(int n) {
		int tmp = 0;
		while (n > 0 && ((tmp & (1 << n % 10)) | 0) == 0) {
			tmp |= 1 << n % 10;
			n /= 10;
		}
		return n == 0;
	}
}
