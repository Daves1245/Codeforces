import java.util.Scanner;

public class NearlyLucky {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '4' || str.charAt(i) == '7') {
				count++;
			}
		}

		if (count == 4 || count == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		in.close();
	}
}
