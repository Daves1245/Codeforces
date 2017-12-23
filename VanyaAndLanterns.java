import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VanyaAndLanterns {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), l = in.nextInt();
		ArrayList<Integer> lp = new ArrayList<>(); // lp = lamp points
		for (int i = 0; i < n; i++) {
			lp.add(in.nextInt());
		}

		Collections.sort(lp);
		ArrayList<Integer> ld = new ArrayList<>();// ld = lamp distances

		ld.add(Collections.min(lp) * 2);
		ld.add(2 * (l - Collections.max(lp)));

		for (int i = 0; i < lp.size() - 1; i++) {
			ld.add(Math.abs(lp.get(i + 1) - lp.get(i) - 1));
		}

		System.out.println(Arrays.asList(lp) + " " + Arrays.asList(ld));

		System.out.println(Collections.max(ld) / 2.0);
		in.close();
	}
}
