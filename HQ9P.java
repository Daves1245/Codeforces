import java.util.Scanner;

public class HQ9P {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		System.out.println(
				str.contains("H") || str.contains("Q") || str.contains("9") ? "YES" : "NO");

		in.close();
	}
}
