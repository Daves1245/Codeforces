import java.util.Scanner;

public class StonesOnATable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();
		String stones = in.nextLine();

		int count = 0;
		for (int i = 1; i < stones.length(); i++) {
			if (stones.charAt(i) == stones.charAt(i - 1)) {
				count++;
			}
		}

		System.out.println(count);

		in.close();
	}
}
