import java.util.HashMap;
import java.util.Scanner;

public class A455Boredom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (long i = 0; i < n; i++) {
			int t = in.nextInt();
			hm.put(t, hm.getOrDefault(t, 0) + 1);
		}
		for (int i = 0; i <= 100000; i++) {
			hm.put(i, hm.getOrDefault(i, 0));
		}
		long[] nums = new long[100001];

		for (int e : hm.keySet()) {
			nums[e] = hm.get(e);
		}

		long[] dp = new long[100001];
		dp[1] = hm.get(1);

		for (int i = 2; i <= 100000; i++) {
			long t = i;
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + t * hm.get(i));
		}

		System.out.println(dp[100000]);

		in.close();
	}

}
