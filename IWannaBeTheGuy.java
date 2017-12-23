import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		HashSet<Integer> s = new HashSet<>();
		int n = in.nextInt();
		int p = in.nextInt();
		for (int i = 0; i < p; i++) {
			s.add(in.nextInt());
		}
		int y = in.nextInt();
		for (int i = 0; i < y; i++) {
			s.add(in.nextInt());
		}

		System.out.println(s.size() >= n ? "I become the guy." : "Oh, my keyboard!");

		in.close();
	}
}
