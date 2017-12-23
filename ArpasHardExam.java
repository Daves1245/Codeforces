import java.util.Scanner;

public class ArpasHardExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] uDigs = {
				8, 4, 2, 6 };

		int n = in.nextInt();
		if (n == 0) {
			System.out.println(1);
		} else {
			System.out.println(uDigs[Math.max((n % 4) - 1, 0)]);
		}
	}
}
