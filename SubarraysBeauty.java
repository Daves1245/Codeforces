import java.util.Scanner;

public class SubarraysBeauty {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			int N = in.nextInt();
			long sum = 0;
			for (int i = 0; i < N; i++) {	
				sum += in.nextInt() & in.nextInt();
			}
		}

		in.close();
	}
}
