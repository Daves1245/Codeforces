import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int max = 0;
		int tram = 0;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			max = max(max, tram -= a);
			max = max(max, tram += b);
		}
		
		System.out.println(max);

		in.close();
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
