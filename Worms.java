import java.util.ArrayList;
import java.util.Scanner;

public class Worms {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> piles = new ArrayList<>();

		piles.set(0, in.nextInt());
		for (int i = 1; i < piles.size(); i++) {
			piles.set(i, piles.get(i - 1) + in.nextInt());
		}

		int m = in.nextInt();
		for(int i = 0; i < m; i++) {
			// Syso( indexOf piles with i
		}

		in.close();
	}
}
