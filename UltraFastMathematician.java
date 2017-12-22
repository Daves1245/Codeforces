import java.util.Scanner;

public class UltraFastMathematician {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String b1 = in.nextLine();
		String b2 = in.nextLine();

		for (int i = 0; i < b1.length(); i++) {
			System.out
					.print((Character.getNumericValue(b1.charAt(i)) == 1 ^ Character.getNumericValue(b2.charAt(i)) == 1)
							? "1" : "0");
		}

		in.close();
	}
}