import java.util.Scanner;

public class Translation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println(new StringBuilder(in.next()).reverse().toString().equals(in.next()) ? "YES" : "NO");
		in.close();
	}
}
