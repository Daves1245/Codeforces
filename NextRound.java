import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(), k = in.nextInt();
		
		int[] scores = new int[n];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}

		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] >= scores[k - 1] && scores[i] > 0) {
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(count);
		in.close();
	}
}
