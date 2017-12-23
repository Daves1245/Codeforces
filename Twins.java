import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twins {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> coins = new ArrayList<Integer>();
		
		int n = in.nextInt();
		int total = 0;
		int cv = 0;
		int nc = 0;
		for(int i = 0; i < n; i++) {
			coins.add(in.nextInt());
			total += coins.get(i);
		}
		
		Collections.sort(coins);

		while (cv <= total / 2) {
			nc++;
			cv += coins.get(n - nc);
		}
		
		System.out.println(nc);

		in.close();
	}
}
