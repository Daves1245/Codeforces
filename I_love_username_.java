import java.util.Scanner;

public class I_love_username_ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int cmax = 0;
		int cmin = 1000 + 1; // current at runtime
		int count = 0;
		cmax = cmin = in.nextInt();
		for (int i = 1; i < n; i++) {
			int score = in.nextInt();
			if (score > cmax) {
				cmax = score;
				count++;
			}
			if (score < cmin) {
				cmin = score;
				count++;
			}
		}
		
		System.out.println(count);

		in.close();
	}
}
