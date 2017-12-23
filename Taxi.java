import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] map = new int[5];
		for (int i = 0; i < n; i++) {
			map[in.nextInt()]++;
		}
		long answer = map[4];
		int min13 = Math.min(map[1], map[3]);
		answer += min13;
		map[1] -= min13;
		map[3] -= min13;
		answer += map[3];
		answer += map[2] / 2;
		map[2] %= 2;
		if (map[2] == 1 && map[1] >= 2) {
			answer++;
			map[2] = 0;
			map[1] -= 2;
		}
		answer += Math.ceil((map[1] + map[2]) / 4f);

		System.out.println(answer);
		
		in.close();
	}
}