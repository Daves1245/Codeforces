import java.util.Scanner;

public class TripForMeal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < 20; i++) {
			System.out.println(i & 1);
		}
	}
	
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}
