import java.util.Scanner;

public class SoldierAndBananas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = in.nextInt();
		int w = in.nextInt();
		int n = in.nextInt();

		System.out.println((Math.abs(w - (n * (n + 1) / 2) * k)));

		in.close();
	}
}
