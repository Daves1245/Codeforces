import java.util.Scanner;

public class Buttons {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextInt();
		System.out.println(n * (n + 1) * (n - 1) / 6 + n);
		
		in.close();
	}
}
