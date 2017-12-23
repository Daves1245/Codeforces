import java.util.Scanner;

public class FlippingGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		int n = in.nextInt();
//		int[] p = new int[n];
//		boolean[] s = new boolean[n];
//
//		for (int i = 0; i < n; i++) {
//			// s[i] = in.nextInt() == 1;
//			// p[i] = (i > 1) ? p[i - 1] + (s[i] ? 1 : 0) : s[i] ? 1 : 0;
//
//			if (i == 0) {
//				p[i] = in.nextInt();
//				s[i] = p[i] == 1;
//				continue;
//			}
//
//			p[i] = p[i - 1] + in.nextInt();
//			s[i] = p[i] - p[i - 1] == 1;
//
//		}
//	
//		int i = 0, j = n - 1, m = 0;
//		while (i != j && j != n / 2) {
//			if (!s[i]) i++;
//			if (!s[j]) j--;
//			if (s[j] && s[i]) m = max(m, p[j] - p[i]);
//			i++;
//
//		}
//
//		System.out.println(m);
		
		
		int[] p = new int[in.nextInt()];
		for(int i = 0; i < p.length; i++) {
			p[i] = in.nextInt();
		}
		
		int msf = Integer.MIN_VALUE, meh = 0;
		for(int i = 0; i < p.length; i++) {
			meh = meh + p[i];
//			if(msf)
		}
		
		in.close();

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
