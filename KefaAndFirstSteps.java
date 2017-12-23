import java.util.Scanner;

public class KefaAndFirstSteps {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int nums[] = new int[in.nextInt()];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}

		int max = 1, count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] >= nums[i]) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 1;
			}
		}

		System.out.println(max);

		in.close();
	}
}
