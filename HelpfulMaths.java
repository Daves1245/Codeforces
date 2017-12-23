import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char[] nums = in.nextLine().toCharArray();
		Arrays.sort(nums);

		String temp = new String(nums);

		for (int i = temp.lastIndexOf("+") + 1; i < temp.length(); i++) {
			System.out.print(temp.charAt(i) + ((i == temp.length() - 1) ? "" : "+"));
		}

	}
}
