import java.util.Scanner;

public class DevuTheSingerAndChuruTheJoker {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), d = in.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += in.nextInt();
		}

		if (d - (n * 10) < 0) {
			System.out.println(-1);
		} else {
			System.out.println((d - count) / 5);
		}

		in.close();
	}
}
