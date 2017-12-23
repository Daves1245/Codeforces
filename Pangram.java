import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();
		HashSet<Character> uniquechars = new HashSet<>();

		String str = in.nextLine();
		for (int i = 0; i < str.length(); i++) {
			uniquechars.add(Character.toLowerCase(str.charAt(i)));
		}

		System.out.println(uniquechars.size() == 26 ? "YES" : "NO");
		in.close();
	}
}
