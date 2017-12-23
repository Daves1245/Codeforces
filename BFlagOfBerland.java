import java.util.HashMap;
import java.util.Scanner;

public class BFlagOfBerland {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), m = in.nextInt();

		if (n % 3 != 0 && m % 3 != 0) {
			System.out.println("NO");
			System.exit(0);
		}

		String[] flag = new String[n];
		for (int i = 0; i < n; i++) {
			flag[i] = in.next();
		}

		if (checkVertical(flag) || checkHorizontal(flag)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
	
	
	
	public static boolean checkVertical(String[] flag) {

		HashMap<Character, Integer> chars = new HashMap<>();
		chars.put('R', 0);
		chars.put('G', 0);
		chars.put('B', 0);

		for (int i = 1; i < flag[0].length(); i++) {

			if (flag[0].charAt(i) != flag[0].charAt(i - 1)) {
				chars.put(flag[0].charAt(i - 1), 1);
				if (chars.getOrDefault(flag[0].charAt(i), -1) != -1) { return false; }

			}
			if (flag[0].charAt(i) != flag[0].charAt(i - 1) && i % (flag[0].length() / 3) != 0) { return false; }
		}

		for (int i = 1; i < flag.length; i++) {
			if (!flag[i].equals(flag[i - 1])) { return false; }
		}

		return true;
	}

	public static boolean checkHorizontal(String[] flag) {
		HashMap<Character, Integer> chars = new HashMap<>();

		chars.put('R', 0);
		chars.put('G', 0);
		chars.put('B', 0);

		// Check that entire line across is of same char
		for (int i = 1; i < flag[0].length(); i++) {
			if (flag[0].charAt(i) != flag[0].charAt(i - 1)) { return false; }
		}

		for (int i = 1; i < flag.length; i++) {
			if (!flag[i].equals(flag[i - 1])) {
				for (int j = 1; j < flag[i].length(); j++) {
					if (flag[i].charAt(j) != flag[i].charAt(j - 1)) { return false; }
				}

				if (chars.getOrDefault(flag[i].charAt(0), -1) != -1) { return false; }
				chars.put(flag[i - 1].charAt(0), 1);
				chars.put(flag[i].charAt(i), 1);
			}
			if (!flag[i].equals(flag[i - 1]) && i % (flag.length / 3) != 0) { return false; }
		}

		return true;
	}
}