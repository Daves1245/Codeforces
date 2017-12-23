import java.util.Scanner;

public class HolidayOfEquality {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] welfare = new int[in.nextInt()];

		int max = welfare[0] = in.nextInt();

		for (int i = 1; i < welfare.length; i++) {
			max = Math.max(max, welfare[i] = in.nextInt());
		}

		int min = 0;
		for (int i = 0; i < welfare.length; i++) {
			min += max - welfare[i];
		}

		System.out.println(min);

		in.close();
	}
}
