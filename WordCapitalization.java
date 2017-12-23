import java.util.Scanner;

public class WordCapitalization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		System.out.println(Character.toUpperCase(str.charAt(0)) + str.substring(1));

		in.close();
	}
}
