import java.util.Scanner;

public class CapsLock {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		if (str.toUpperCase().equals(str)) {
			System.out.println(str.toLowerCase());
			System.exit(0);
		}
		if (str.substring(1, str.length()).equals(str.substring(1, str.length()).toUpperCase())) {
			System.out.println(Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length()).toLowerCase());
			System.exit(0);
		}
		
		System.out.println(str);

		in.close();
	}
}
