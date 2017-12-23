import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GravityFlip {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			a.add(in.nextInt());
		}

		Collections.sort(a);

		for (int i : a) {
			System.out.print(i + " ");
		}

		in.close();
	}
}
