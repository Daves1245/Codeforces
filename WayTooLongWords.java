import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			String s = in.next();
			if (s.length() > 10) {
				s = "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
			}
			
			System.out.println(s);
		}
		
		in.close();
	}
}
