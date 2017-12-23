import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i) && "01".contains(str.charAt(i) + "")) {
				count++;
				if (count == 7) {
					System.out.println("YES");
					System.exit(0);
				}
			} else {
				count = 1;
			}
		}

		System.out.println("NO");
		in.close();
	}
}