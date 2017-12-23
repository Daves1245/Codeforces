import java.util.Scanner;

public class AKeyRaces {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int s = in.nextInt(), v1 = in.nextInt(), v2 = in.nextInt(), t1 = in.nextInt(), t2 = in.nextInt();
		int diffScore = ((s * v1 + 2 * t1) - (s * v2 + 2 * t2));

		if (diffScore < 0) {
			System.out.println("First");
		}
		if (diffScore > 0) {
			System.out.println("Second");
		}
		if (diffScore == 0) {
			System.out.println("Friendship");
		}

		in.close();
	}
}
