import java.util.Scanner;

public class BitPP {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		in.nextLine();
		int sum = 0;
		
		for(int i = 0; i < T; i++) {
			if(in.nextLine().contains("+")) {
				sum++;
			} else {
				sum--;
			}
		}
		
		System.out.println(sum);
		
		in.close();
	}
}
