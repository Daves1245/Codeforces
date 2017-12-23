import java.util.Scanner;

public class PetyaAndStrrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextLine().toLowerCase().compareTo(in.nextLine().toLowerCase());
		System.out.println(n > 0 ? 1 : n < 0 ? -1 : n);

		in.close();
	}
}
